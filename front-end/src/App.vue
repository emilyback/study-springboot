<template>
  <div id="app">
    
      ID: <input type="text" name="loginId" v-model="loginParam.loginId"><br/>
      PWD: <input type="password" name="loginPwd" v-model="loginParam.loginPwd"><br/>
      <button @click="adminCheck">log in </button>
    
    <div v-if="!isAdmin">
      Fail
    </div>
    <div v-else>
      Welcome Admin
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
      isAdmin: false
    }
  },
  methods: {
    adminCheck() {  
      axios.post(`/api/AdminCheck`, this.loginParam).then(res => {
        console.log('res', res)
        if(res.data.result === "OK") 
          this.isAdmin = true
        else
          alert('틀렸어!')
      }).catch((ex) => {
        console.warn('Error')
        alert('error');
      })
    }
  }
}
</script>