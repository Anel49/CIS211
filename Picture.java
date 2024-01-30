public class Picture{
    Image[] imgArr;
    int capacity = 100;
/**
 * The below constructors create Picture objects using Image objects. If a
 * capacity isn't passed, sets the Picture array's maximum capacity to 100. If
 * a capacity is specified, assigns cap to capacity and sets the array to that
 * capacity.
 */
    public Picture(){
        imgArr = new Image[this.capacity];
    }
    public Picture(int capacity){
        this.capacity = capacity;
        imgArr = new Image[this.capacity];
    }
    public int getCapacity(){
        return this.capacity;
    }
/**
 * getImageData() simply returns the image array created by Picture.
 */
    public Image[] getImageData(){
        return imgArr;
    }
/**
 * Everything I attempted with this failed.
 */
    public void addImage(Image newImage){
        for (int i = 0; i < imgArr.length; i++){
            if (imgArr[i] == null){
                imgArr[i] = newImage;
                break;
            }
        }
    }
/**
 * Everything I attempted with this failed.
 */
    public Image deleteImage(Image image){
        return null;
    }
/**
 * This method is supposed to return a boolean indicating whether the imgArr
 * is empty, though I'm unsure if it doesn't because there are no tests to
 * test if it works.
 */
    public boolean isEmpty(){
        int count = 0;
        for (int i = 0; i < imgArr.length; i++){
            if (imgArr[i] == null){
                count++;
            }
        }
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
    }
/**
 * This method is supposed to return a boolean indicating whether the imgArr
 * is full, though I'm unsure if it doesn't because there are no tests to
 * test if it works.
 */
    public boolean isFull(){
        int count = 0;
        for (int i = 0; i < imgArr.length; i++){
            if (imgArr[i] == null){
                count++;
            }
        }
        if (count > 0){
            return false;
        }
        else {
            return true;
        }
    }
/**
 * Everything I attempted with this failed.
 */
    public void enlarge(){
        int num = imgArr.length * 2;
        Image[] newArr = new Image[num];

        for (int i = 0; i < num; i++){
            newArr[i] = imgArr[i];
        }

        imgArr = newArr;
    }
/**
 * Everything I attempted with this failed.
 */
    public void crop(){
        int num = imgArr.length / 2;        
        Image[] tempArr = new Image[num];

        for (int i = 0; i < num; i++){
            tempArr[i] = imgArr[i];
        }
        Image[] imgArr = new Image[num];
        
        for (int i = 0; i < num; i++){
            imgArr[i] = tempArr[i];
        }
    }
/**
 * Everything I attempted with this failed.
 */
    public int getNumberOfImages(){
        int count = 0;
        for (int i = 0; i < imgArr.length; i++){
            if (imgArr[i] != null){
                count++;
            }
        }
        return count;
    }
}