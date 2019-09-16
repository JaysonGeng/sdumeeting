 package  com.jayson.entity;

 import com.jayson.entity.User;

 public class User {
   private int id;
   private String name;
   private String email;
   private String password;
   private int role_id;
   private String salt;
   private int confirmed;
   private int active;

/* 15 */   public int getId() { return this.id; }



/* 19 */   public void setId(int id) { this.id = id; }



/* 23 */   public String getName() { return this.name; }



/* 27 */   public void setName(String name) { this.name = name; }



/* 31 */   public String getEmail() { return this.email; }



/* 35 */   public void setEmail(String email) { this.email = email; }



/* 39 */   public String getPassword() { return this.password; }



/* 43 */   public void setPassword(String password) { this.password = password; }



/* 47 */   public int getRole_id() { return this.role_id; }



/* 51 */   public void setRole_id(int role_id) { this.role_id = role_id; }



/* 55 */   public String getSalt() { return this.salt; }



/* 59 */   public void setSalt(String salt) { this.salt = salt; }



/* 63 */   public int getConfirmed() { return this.confirmed; }



/* 67 */   public void setConfirmed(int confirmed) { this.confirmed = confirmed; }



/* 71 */   public int getActive() { return this.active; }



/* 75 */   public void setActive(int active) { this.active = active; }




/* 80 */   public String toString() { return "User{id=" + this.id + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + ", password='" + this.password + '\'' + ", role_id=" + this.role_id + ", salt='" + this.salt + '\'' + ", confirmed=" + this.confirmed + ", active=" + this.active + '}'; }
 }


/* Location:              C:\Users\MichaelOD_WIN10\Desktop\fsdownload\sdu-meeting-0.0.9-SNAPSHOT.jar!\BOOT-INF\classes\com\jayson\entity\User.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */