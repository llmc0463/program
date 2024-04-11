<template>
  <div id="registerModal" class="modal">
    <div class="modal-content">
      <div class="style1">注册</div>
      <span class="close">&times;</span>
      <form class="form" style="padding-top: 40px">
        <label for="regUsername" style="padding-right: 18px"
          ><span style="color: red">*</span><span class="style2">用户名</span></label
        >
        <input
          class="style5"
          type="text"
          id="regUsername"
          name="regUsername"
          v-model="regUsername"
        />
        <br />
        <label for="regPassword" style="padding-right: 36px"
          ><span style="color: red">*</span><span class="style2">密码</span></label
        >
        <input
          class="style5"
          type="password"
          id="regPassword"
          name="regPassword"
          v-model="regPassword"
        />
        <br />
        <label for="lastRegPassword" style="padding-bottom: 10px"
          ><span style="color: red">*</span><span class="style2">确认密码</span></label
        >
        <input
          class="style5"
          type="password"
          name="lastRegPassword"
          id="lastRegPassword"
          v-model="lastRegPassword"
        />
        <br />
        <div class="row" style="padding-left: 18px; margin: 0">
          <input
            class="style4 col-md-3"
            id="register1"
            type="button"
            value="提交"
            @click="register"
          />
          <input
            class="style3 col-md-3 col-md-offset-1"
            style="margin-left: 16px; margin-right: 16px"
            type="reset"
            value="重置"
          />
          <input
            class="style3 col-md-3 col-md-offset-1"
            id="return"
            style="margin-left: 0"
            type="button"
            value="返回"
          />
        </div>
      </form>
    </div>
  </div>
</template>

<script src="https://cdn.jsdelivr.net/npm/vue@2"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
import EventBus from "./eventBus";
export default {
  // el: "#registerModal",
  data() {
    return {
      regUsername: "",
      regPassword: "",
      lastRegPassword: "",
    };
  },
  methods: {
    showRegisterModal() {
      this.$el.style.display = "block";
    },
    hideRegisterModal() {
      this.$el.style.display = "none";
    },
    showLoginAndHideRegister() {
      this.hideRegisterModal();
      // loginModal.showLoginModal();
      EventBus.$emit("login-modal-show");
    },
    register() {
      if (!this.regUsername) {
        alert("用户名不能为空");
      } else if (!this.regPassword) {
        alert("密码不能为空");
      } else if (!this.lastRegPassword) {
        alert("请再次输入密码");
      } else if (this.regPassword !== this.lastRegPassword) {
        alert("两次输入的密码不一致");
      } else {
        axios({
          method: "post",
          url: "http://localhost:9999/ibs/user/register",
          data: {
            username: this.regUsername,
            password: this.regPassword,
          },
          headers: {
            "Content-Type": "application/json",
          },
        })
          .then(
            function (res) {
              // console.log(res.data);
              // 处理注册成功的逻辑，例如隐藏注册模态框
              alert("注册成功");
              this.hideRegisterModal();
            }.bind(this)
          )
          .catch(function (error) {
            console.log(error);
            // 可以在此处显示错误信息
            alert("注册失败：" + error.message);
          });
      }
    },
  },
  mounted() {
    document
      .getElementById("registerBtn")
      .addEventListener("click", this.showRegisterModal);
    document
      .getElementById("return")
      .addEventListener("click", this.showLoginAndHideRegister);
    document
      .getElementsByClassName("close")[1]
      .addEventListener("click", this.hideRegisterModal);
    EventBus.$on("register-modal-show", () => {
      this.showRegisterModal();
    });
  },
};
</script>

<style>
.panel {
  margin: 0;
  padding: 0;
}
.chuangkou1 {
  background: url(./img/home-banner@2x.jpg);
  background-size: cover;
  height: 60vh;
}
.panel-body {
  background-size: cover;
}
.center {
  display: flex;
  justify-content: center;
  align-items: center;
}
#rightnow {
  width: 180px;
  height: 48px;
  display: block;
  margin-left: auto;
  margin-right: auto;
}
.thumbnail {
  border-color: white;
  text-align: left;
}
@media (max-width: 768px) {
  .picture {
    width: 100%;
  }
}
.modal {
  display: none;
  position: fixed;
  z-index: 1;
  /* left: 0;
    top: 0; */
  inset: 0; /* 在视口中居中，相当于 top, right, bottom, left 都为 0 */
  width: 100%;
  height: 100%;
  overflow: auto;
  background-color: rgba(0, 0, 0, 0.4);
}

.modal-content {
  display: flex; /* 使用Flexbox布局 */
  justify-content: center; /* 水平居中 */
  align-items: center; /* 垂直居中 */
  background-color: #fefefe;
  margin: 15% auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
  height: 80%;
  max-width: 350px;
  max-height: 250px;
  position: relative;
}

.form {
  width: 100%;
}

.close {
  color: #aaa;
  /* float: right ; */
  font-size: 28px;
  font-weight: bold;
  position: absolute;
  top: 10px;
  right: 10px;
}

.close:hover,
.close:focus {
  color: black;
  text-decoration: none;
  cursor: pointer;
}
.style1 {
  font-size: 24px;
  font-weight: bold;
  position: absolute;
  top: 25px;
  justify-content: center; /* 水平居中 */
}
.style2 {
  font-size: 18px;
  font-weight: normal;
  color: #666;
}
.style3 {
  font-size: 18px;
  font-weight: normal;
  color: #666;
  border-color: #dddfe6;
  border-radius: 5px;
  padding-top: 5px;
}
.style4 {
  font-size: 18px;
  font-weight: normal;
  color: white;
  background-color: #589ef8;
  border-color: transparent;
  border-radius: 5px;
  padding-top: 5px;
}
.style5 {
  margin-bottom: 20px;
  border-color: #dddfe6;
  border-radius: 5px;
}
</style>
