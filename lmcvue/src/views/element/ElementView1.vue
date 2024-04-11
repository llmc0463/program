<template>
  <div class="panel">
    <div class="row">
      <div class="col-md-12">
        <div class="chuangkou1">
          <form action="#" class="form-horizontal" role="form" style="padding: 20px">
            <div class="form-group">
              <span class="col-md-3 col-md-offset-1">
                <img src="./img/logo-white.svg" alt="xiaotubiao" style="width: 40%" />
              </span>
              <span class="col-md-2 col-md-offset-6" style="float: right">
                <button
                  class="btn btn-default"
                  id="loginBtn"
                  style="background-color: #335adf; border: 1px solid white; color: white"
                >
                  登录
                </button>
                <button
                  class="btn btn-default col-md-offset-1"
                  id="registerBtn"
                  style="background-color: #335adf; border: 1px solid white; color: white"
                >
                  注册
                </button>
              </span>
            </div>
          </form>
          <div class="text-center" style="padding: 20px">
            <h1 style="color: white; font-size: 3.6rem; margin-bottom: 20px">
              云端编程，浏览器里边学边练
            </h1>
            <h4 style="color: white">
              软件定义一切，网络连接时空，学习软件技术，创造未来世界。
            </h4>
            <br />
            <button
              type="button"
              id="show"
              @click="showAlert"
              class="btn btn-default"
              style="color: #0c6efd; font-size: 20px"
            >
              马上学习
            </button>
          </div>
        </div>
      </div>
    </div>
    <div class="row">
      <div class="panel-body" style="background-color: #f0f0f0">
        <div class="center">
          <img class="picture" src="./img/img-lab@2x.png" alt="tupian1" />
        </div>
        <div
          align="left"
          class="h2 col-md-offset-1 col-xs-offset-1"
          style="font-weight: bolder; font-size: 30px; margin-bottom: 2rem"
        >
          高级Web编程实验室
        </div>
        <div
          align="left"
          class="h4 col-md-offset-1 col-xs-offset-1"
          style="color: black; padding-right: 0.625rem; margin-bottom: 1.5rem"
        >
          每人拥有自己完全独立的编程实验室，内置所有基础软件及学习素材。打开浏览器，即刻开始编程！
        </div>
        <div align="left" style="padding: 0">
          <button
            type="button"
            id="learn"
            @click="learnAlert1"
            class="btn text-center col-md-offset-1 col-md-1 col-xs-offset-1 col-xs-10"
            style="border: 1px solid black; color: #6c757d; margin-bottom: 4rem"
          >
            了解详情
          </button>
        </div>
      </div>
      <div class="panel-body">
        <div class="center">
          <img class="picture" src="./img/img-screens@2x.png" alt="tupian2" />
        </div>
        <div
          align="left"
          class="h2 col-md-offset-1 col-xs-offset-1"
          style="
            font-weight: bolder;
            font-size: 30px;
            margin-top: 2rem;
            margin-bottom: 2rem;
          "
        >
          双屏学习
        </div>
        <div
          align="left"
          class="h4 col-md-offset-1 col-xs-offset-1"
          style="color: black; padding-right: 0.625rem; margin-bottom: 1.5rem"
        >
          双屏学习，小屏视频互动，大屏实际操作，学习无障碍。打开浏览器，即刻开始编程！
        </div>
        <div align="left" style="padding: 0">
          <button
            type="button"
            id="learn2"
            @click="learnAlert2"
            class="btn text-center col-md-offset-1 col-md-1 col-xs-offset-1 col-xs-10"
            style="
              border: 1px solid black;
              color: #6c757d;
              background-color: white;
              margin-bottom: 4rem;
            "
          >
            了解详情
          </button>
        </div>
        <br />
      </div>
    </div>
    <div class="row">
      <div class="col-md-12">
        <div
          align="left"
          class="h3 col-md-offset-1 col-xs-offset-1"
          style="font-weight: bolder; font-size: 2.5rem"
        >
          课程特色
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    showAlert() {
      alert("你点击了按钮！");
    },
    learnAlert1() {
      alert("开始了解详情！");
    },
    learnAlert2() {
      alert("开始了解详情！");
    },
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
