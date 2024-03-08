import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Hashtable;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.image.codec.jpeg.JPEGEncodeParam;

public class QRCodeGenerator {

    private static final int QRCODE_SIZE = 300;
    private static final String FILE_PATH = "./MyQRCode.jpg";

    public static void main(String[] args) {
        String qrCodeText = "This is my first QR Code";
        generateQRCodeImage(qrCodeText, QRCODE_SIZE, QRCODE_SIZE, FILE_PATH);
        System.out.println("QR Code generated successfully.");
    }

    private static void generateQRCodeImage(String text, int width, int height, String filePath) {
        try {
            Hashtable<EncodeHintType, String> hints = new Hashtable<>();
            hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");

            com.google.zxing.qrcode.QRCodeWriter qrCodeWriter = new com.google.zxing.qrcode.QRCodeWriter();
            com.google.zxing.common.BitMatrix bitMatrix = qrCodeWriter.encode(text, com.google.zxing.BarcodeFormat.QR_CODE, width, height, hints);

            BufferedImage qrImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            qrImage.createGraphics();

            Graphics2D graphics = (Graphics2D) qrImage.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.fillRect(0, 0, width, height);
            graphics.setColor(Color.BLACK);

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    if (bitMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }

            ImageIO.write(qrImage, "jpg", new File(filePath));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

