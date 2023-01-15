package id.ac.e020320033.wisataappe020320033.model;


public class ModelMain {

    private String txtName;
    private int imgSrc;

    public ModelMain(String txtName, int imgSrc) {
        this.txtName = txtName;
        this.imgSrc = imgSrc;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

}
