    public class EMail
	 {
      private String myUserName;
      private String myHostName;
      private String myExtension;
       public EMail(String address)
		 {
         int pos = address.indexOf("@");
         myUserName = address.substring(0, pos);
         address = address.substring(pos + 1);  
         pos = address.indexOf("."); 
         myHostName = address.substring(0, pos); 
         address = address.substring(pos + 1);  
         myExtension = address;
      }
       public String getUserName()
		 {
         return myUserName;
      }
       public String getHostName()
		 {
         return myHostName;
      }
       public String getExtension()
		 {
         return myExtension;
      }
       public String toString()
		 {
         return myUserName + "@" + myHostName + "." + myExtension;
      }
   }