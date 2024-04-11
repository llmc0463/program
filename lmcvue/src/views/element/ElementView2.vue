<template>
  <div class="panel-body">
    <div class="container" style="margin: 0">
      <div class="row">
        <!-- 缩略图 1-->
        <div class="col-xs-12 col-sm-4 col-md-3 col-md-offset-1">
          <div class="suo">
            <!-- <div class="item1 col-xs-1 col-xs-offset-1"> -->
            <svg
              align="left"
              xmlns="http://www.w3.org/2000/svg"
              width="55"
              height="55"
              fill="currentColor"
              class="bi bi-collection"
              viewBox="0 0 16 16"
              style="
                color: white;
                background-color: #3280fd;
                border-radius: 10px;
                padding: 12;
              "
            >
              <path
                d="M2.5 3.5a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-11zm2-2a.5.5 0 0 1 0-1h7a.5.5 0 0 1 0 1h-7zM0 13a1.5 1.5 0 0 0 1.5 1.5h13A1.5 1.5 0 0 0 16 13V6a1.5 1.5 0 0 0-1.5-1.5h-13A1.5 1.5 0 0 0 0 6v7zm1.5.5A.5.5 0 0 1 1 13V6a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 .5.5v7a.5.5 0 0 1-.5.5h-13z"
              />
            </svg>
            <!-- </div> -->
            <!-- <div class="item2 col-xs-10"> -->
            <div align="left" class="h3" style="font-weight: bolder; font-size: 2.5rem">
              丰富的教学服务
            </div>
            <div align="left" class="h4" style="color: black; font-size: 1.5rem">
              特色教学服务功能，各种配套教学服务，在线学习从未如此轻松。
            </div>
            <div align="left" class="btn" style="padding-left: 0">
              <button
                class="btn btn-link"
                id="show1"
                @click="showAlert1"
                style="text-decoration: underline; color: #3280fd; padding: 0"
              >
                马上学习 <i class="glyphicon glyphicon-chevron-right"></i>
              </button>
            </div>
            <br />
            <!-- </div> -->
          </div>
        </div>
        <!-- 缩略图 2-->
        <div class="col-xs-12 col-sm-4 col-md-3 col-md-offset-1">
          <div class="suo">
            <!-- <div class="item1 col-xs-1 col-xs-offset-1"> -->
            <svg
              align="left"
              xmlns="http://www.w3.org/2000/svg"
              width="55"
              height="55"
              fill="currentColor"
              class="bi bi-person-circle"
              viewBox="0 0 16 16"
              style="
                color: white;
                background-color: #3280fd;
                border-radius: 10px;
                padding: 12;
              "
            >
              <path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z" />
              <path
                fill-rule="evenodd"
                d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z"
              />
            </svg>
            <!-- </div> -->
            <!-- <div class="item2 col-xs-10"> -->
            <div align="left" class="h3" style="font-weight: bolder; font-size: 2.5rem">
              多元的学习方式
            </div>
            <div align="left" class="h4" style="color: black; font-size: 1.5rem">
              知识提炼、答疑解惑、实时互动、开发有特色的教学服务方式。
            </div>
            <div align="left" class="btn" style="padding-left: 0">
              <button
                class="btn btn-link"
                @click="showAlert2"
                id="show2"
                style="text-decoration: underline; color: #3280fd; padding: 0"
              >
                马上学习 <i class="glyphicon glyphicon-chevron-right"></i>
              </button>
            </div>
            <br />
            <!-- </div> -->
          </div>
        </div>
        <!-- 缩略图 3-->
        <div class="col-xs-12 col-sm-4 col-md-3 col-md-offset-1">
          <div class="suo">
            <!-- <div class="item1 col-xs-1 col-xs-offset-1"> -->
            <svg
              align="left"
              xmlns="http://www.w3.org/2000/svg"
              width="55"
              height="55"
              fill="currentColor"
              class="bi bi-toggles2"
              viewBox="0 0 16 16"
              style="
                color: white;
                background-color: #3280fd;
                border-radius: 10px;
                padding: 12;
              "
            >
              <path
                d="M9.465 10H12a2 2 0 1 1 0 4H9.465c.34-.588.535-1.271.535-2 0-.729-.195-1.412-.535-2z"
              />
              <path
                d="M6 15a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm0 1a4 4 0 1 1 0-8 4 4 0 0 1 0 8zm.535-10a3.975 3.975 0 0 1-.409-1H4a1 1 0 0 1 0-2h2.126c.091-.355.23-.69.41-1H4a2 2 0 1 0 0 4h2.535z"
              />
              <path d="M14 4a4 4 0 1 1-8 0 4 4 0 0 1 8 0z" />
            </svg>
            <!-- </div> -->
            <!-- <div class="item2 col-xs-10"> -->
            <div align="left" class="h3" style="font-weight: bolder; font-size: 2.5rem">
              高品质的学习体验
            </div>
            <div align="left" class="h4" style="color: black; font-size: 1.5rem">
              多屏合一，随时学习，随时在线，学习记录一目了然，知识充电不再受限。
            </div>
            <div align="left" class="btn" style="padding-left: 0">
              <button
                class="btn btn-link"
                id="show3"
                @click="showAlert3"
                style="text-decoration: underline; color: #3280fd; padding: 0"
              >
                马上学习 <i class="glyphicon glyphicon-chevron-right"></i>
              </button>
            </div>
            <br />
            <!-- </div> -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    showAlert1() {
      alert("你点击了按钮！");
    },
    showAlert2() {
      alert("你点击了按钮！");
    },
    showAlert3() {
      alert("你点击了按钮！");
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
.suo {
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
