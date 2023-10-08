package functions;

import commands.AppBotCommand;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class FilterOperations {
    @AppBotCommand(name = "grayScale", description = "greyScale filter",
            showInKeyboard = true)
    public static float[] grayScale(float[] rgb) {
        final float mean = (rgb[0] + rgb[1] + rgb[2]) / 3;
        rgb[0] = mean;
        rgb[1] = mean;
        rgb[2] = mean;
        return rgb;
    }
    @AppBotCommand(name = "onlyRed", description = "onlyRed filter",
            showInKeyboard = true)
    public static float[] onlyRed(float[] rgb) {
        rgb[1] = 0;
        rgb[2] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyGreen", description = "onlyGreen filter",showInKeyboard = true)
    public static float[] onlyGreen(float[] rgb) {
        rgb[0] = 0;
        rgb[2] = 0;
        return rgb;
    }
    @AppBotCommand(name = "onlyBlue", description = "onlyBlue filter",
            showInKeyboard = true)
    public static float[] onlyBlue(float[] rgb) {
        rgb[0] = 0;
        rgb[1] = 0;
        return rgb;
        @AppBotCommand(name = "BufferedImage", description = "BufferedImage filter",
                showInKeyboard = true)
        public static BufferedImage blur(BufferedImage img) {
            float val = 1.0f / 9.0f;
            float[] filter = { val, val, val, val, val, val, val, val, val };
            BufferedImageOp op = new ConvolveOp(new Kernel(3, 3, filter));
            return op.filter(img, null);
        }
    }
}

