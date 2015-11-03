package nadavatisiva.app.codesign;


public class NatureItem {
    private String mName;
    private String mDes;
    private int mThumbnail;
    private int mShortlist;
    private int mStarNone;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDes() {
        return mDes;
    }

    public void setDes(String des) {
        this.mDes = des;
    }

    public int getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }


    public int getShortlist() {
        return mShortlist;
    }

    public void setShortlist(int Shortlist) {
        this.mShortlist = Shortlist;
    }

    public int getStarNone() {
        return mStarNone;
    }

    public void setStarNone(int StarNone) {
        this.mStarNone = StarNone;
    }
}
