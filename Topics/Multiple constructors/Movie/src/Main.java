class Movie {
    private String title;
    private String desc;
    private int year;

    // write two constructors here
    Movie (String t, String d, int y) {
        this.title = t;
        this.desc = d;
        this.year = y;
    }

    Movie (String t, int y) {
        this.title = t;
        this.desc = "empty";
        this.year = y;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }
}