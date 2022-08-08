String getUserName(String fn, String ln){
return fn.substring(0,1).toLowerCase() + ln.toLowerCase()
}

println getUserName("Chris", "Behrens")
