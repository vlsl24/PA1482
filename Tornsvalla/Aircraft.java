class Aircraft {

    private String fullName;

    public Aircraft(String fullName) {
        this.fullName = fullName;
    }


    public String name(){
        fullName = "test";
        return fullName;
      }

    public String getFullName(){
        return fullName;
    }


}
