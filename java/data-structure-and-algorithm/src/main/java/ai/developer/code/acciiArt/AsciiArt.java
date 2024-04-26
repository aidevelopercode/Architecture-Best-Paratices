package ai.developer.code.acciiArt;

import java.awt.*;
import java.awt.image.BufferedImage;

public class AsciiArt {

    public static void printChart(String s) {
        int height = 100;
        int width = 1000;
        BufferedImage image = getImageIntegerMode(width, height);

        Graphics2D graphics2D = getGraphics2D(image.getGraphics());
        graphics2D.drawString(s, 6, ((int) (height * 0.67)));
        for (int y = 0; y < height; y++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int x = 0; x < width; x++) {
                stringBuilder.append(image.getRGB(x, y)  == -16777216 ? " " : "A");
            }

            if (stringBuilder.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(stringBuilder);
        }









    }


    private static BufferedImage getImageIntegerMode(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    }

    private static Graphics2D getGraphics2D(Graphics graphics) {
//        graphics.setFont(settings.font);

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        return graphics2D;
    }
}
