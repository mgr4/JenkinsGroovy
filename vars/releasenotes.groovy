abstract class User{
String ln;
String fn

public String Username(){
return getUserName(this.fn,this.ln)
}

private String getUserName(String fn, String ln){
return fn.substring(0,1).toLowerCase() + ln.toLowerCase()
}
}

class Artist extends User{
public String[] Songs;
}

class Producer extends User{
public void Produce() {}
}

User[] users = [new Artist(fn: "Bob", ln: "Dylan", Songs:["Its alright ma"]),
                new Artist(fn: "Julie", ln: "Lyne", Songs:["Crying"]),
                new Artist(fn: "Lisa", ln: "Petty", Songs:["Its raining"])]
                
users.each(user -> println("Username is ${user.Username()}"));
