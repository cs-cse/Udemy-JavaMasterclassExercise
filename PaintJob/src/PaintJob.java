public class PaintJob {
    public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
        int reqBuckets;
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0)
            return -1;

        else{
            double  area= width*height;
            double numofBuckets= areaPerBucket*extraBuckets;

            if(area>numofBuckets){
                reqBuckets=(int)Math.ceil((area-numofBuckets)/areaPerBucket);



            }
            else {
                return 0;
            }



        }

return reqBuckets;

    }
    public static int getBucketCount(double width,double height,double areaPerBucket) {
        int a;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;

        } else {

            a = (int) Math.ceil((width * height) / areaPerBucket);

        }

        return a;
    }

public static int getBucketCount(double area, double areaPerBucket){
    int b;
        if(area<=0||areaPerBucket<=0)
    return -1;
else{
     b=(int)Math.ceil(area/areaPerBucket);


}
return b;

    }

}
