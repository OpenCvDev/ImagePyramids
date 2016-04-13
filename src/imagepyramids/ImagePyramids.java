
package imagepyramids;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;
public class ImagePyramids 
{
public static void main( String[] args )
{
try{
System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
Mat source = Highgui.imread("digital_image_processing.jpg",
Highgui.CV_LOAD_IMAGE_COLOR);
Mat destination1 = new Mat(source.rows()*2,source.cols()*2,source.type());
destination1 = source;
Imgproc.pyrUp(source, destination1, new Size(source.cols()*2,
source.rows()*2));
Highgui.imwrite("pyrUp.jpg", destination1);
source = Highgui.imread("digital_image_processing.jpg",
Highgui.CV_LOAD_IMAGE_COLOR);
Mat destination = new Mat(source.rows()/2,source.cols()/2,
source.type());
destination = source;
Imgproc.pyrDown(source, destination, new Size(source.cols()/2,
source.rows()/2));
Highgui.imwrite("pyrDown.jpg", destination);
}
catch (Exception e)
{
System.out.println("error: " + e.getMessage());
}
}
    
}

