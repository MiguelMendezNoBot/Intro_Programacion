public class User
{
    private String name;
    private String id;
    
    public User(String name, String id) {
        setName(name);
        setId(id);
    }
    public User(){
    }
    
    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }
    public void setId(String id){
        if(id != null){
            this.id = id;
        }
    }
}
