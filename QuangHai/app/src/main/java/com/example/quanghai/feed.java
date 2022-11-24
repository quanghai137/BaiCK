package com.example.quanghai;

public class feed {
    private int hinh;
    private String Ten;
    private int star;
    private String mota;

    public feed(int hinh, String ten, int star, String mota) {
        this.hinh = hinh;
        Ten = ten;
        this.star = star;
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
