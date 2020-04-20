<template>
  <div id="app">
    <div v-if="!isLogin">
      ID: <input type="text" name="loginId" v-model="loginParam.loginId"><br/>
      PWD: <input type="password" name="loginPwd" v-model="loginParam.loginPwd"><br/>
      <button @click="adminCheck">log in </button>
    </div>
    <div v-else>
      <div v-if="isCorrectLogin">
        {{loginParam.loginName}}님 어서오세요!
      </div>
      <div v-else>
          잘못입력했습니다. 다시하세요
        </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'app',
  data () {
    return {
      loginParam: {
        loginName:'',
        loginId: '',
        loginPwd: '',
      },
      isCorrectLogin: false,
      isLogin:false
    }
  },
  methods: {
    adminCheck() { 
      this.isLogin = true

      axios.post('api/loginCheck', this.loginParam).then(res => {
        console.log('res', res)
        if(res.data!= '') 
          this.isCorrectLogin = true,
          this.loginParam.loginName = res.data
        else
          alert('틀렸어!')
      }).catch((ex) => {
        console.warn(ex)
      })
    }
  }
}
</script>