class User{
String ln;
String fn

public String Username(){
return getUserName(this.fn,this.ln)
}

private String getUserName(String fn, String ln){
return fn.substring(0,1).toLowerCase() + ln.toLowerCase()
}
}


String[] fn = ["Bob","Julie","Lisa"]
String[] ln = ["Dylan","Lyne","Petty"]
for (int i=0; i<fn.size(); i++){
User u=new User(fn: fn[i], ln: ln[i])
println("Username is ${u.Username()}")
}
