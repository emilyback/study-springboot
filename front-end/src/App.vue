<template>
  <div id="app">
    <div v-if="isMember">
      <h2>Welcome {{memberName}}님</h2>
    </div>
    <div v-else>
      ID: <input type="text" name="loginId" v-model="loginParam.loginId"><br/>
      PWD: <input type="password" name="loginPwd" v-model="loginParam.loginPwd"><br/>
      <button @click="login">log in </button>
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
        loginId: '',
        loginPwd: '',
      },
      isMember: false,
      memberName: ''
    }
  },
  methods: {
    login() {  
      axios.post(`api/LoginCheck`,this.loginParam)
      .then(res => {
        const loginResult = res.data.loginResult
        if(loginResult !== null ) {
          this.isMember = true
          this.memberName = loginResult.name
        }
        else {
          this.isMember = false
          alert('가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.')
        }
      }).catch((ex) => {
        alert('error');
      })
    }
  }
}
</script>