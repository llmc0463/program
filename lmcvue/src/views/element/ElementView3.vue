<template>
    <div class="panel-body" style="background-color: #f0f0f0">
        <div align="center" class="h5" style="color: black; font-weight: bold">
          ©2024 云端科技 Artech All rights reserved
        </div>
      </div>
  </template>
  
  <script>
     
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
  
  .form{
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
  .style1{
        font-size: 24px;
        font-weight: bold;
        position: absolute;
        top: 25px;
        justify-content: center; /* 水平居中 */
  }
  .style2{
        font-size: 18px;
        font-weight: normal;
        color: #666;
  }
  .style3{
        font-size: 18px;
        font-weight: normal;
        color: #666;
        border-color: #DDDFE6;
        border-radius: 5px;
        padding-top: 5px;
  }
  .style4{
        font-size: 18px;
        font-weight: normal;
        color:white;
        background-color: #589EF8;
        border-color: transparent;
        border-radius: 5px;
        padding-top: 5px;
  }
  .style5{
        margin-bottom: 20px;
        border-color: #DDDFE6;
        border-radius: 5px;
    }
  </style>