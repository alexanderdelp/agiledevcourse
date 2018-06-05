// Signature: public String encrypt( String message )  
//  
// Test Cases:  
// -----------  
// "" -> ""  
// "A" -> "N"  
// "B" -> "O"  
// "a" -> "N"  
// "N" -> "A"  
// "@" -> "@"  
// "_" -> "_"  
// "{" -> "{"  
// "Ä" -> "NR"  
// "ä" -> "NR"  
// "Ö" -> "BR"  
// "Ü" -> "HR"  
// "ß" -> "FF"  
// "ICH saß da!" -> "VPU FNFF QN!"
