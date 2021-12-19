package com.ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.livestreamv2.filter.FindContourInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONObject;

public class ZlibCompressUtils {
    private static String SEI_HEAD_APP_DATA = "APDT";
    private static String SEI_HEAD_MATTING_DATA = "MATN";
    private static String TAG = "ZlibCompressUtils";

    static {
        Covode.recordClassIndex(100508);
    }

    private static byte charToByte(char c2) {
        return (byte) "0123456789ABCDEF".indexOf(c2);
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] compress(byte[] bArr) {
        MethodCollector.i(12573);
        if (bArr == null) {
            MethodCollector.o(12573);
            return null;
        }
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        MethodCollector.o(12573);
        return byteArray;
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (charToByte(charArray[i3 + 1]) | (charToByte(charArray[i3]) << 4));
        }
        return bArr;
    }

    public static byte[] unCompress(byte[] bArr) {
        MethodCollector.i(12683);
        if (bArr == null) {
            MethodCollector.o(12683);
            return null;
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        byte[] bArr2 = new byte[4096];
        while (!inflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        MethodCollector.o(12683);
        return byteArray;
    }

    public static FindContourInfo getContourInfoFromString(String str) {
        String str2;
        String str3;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("data")) {
                str2 = jSONObject.getString("data");
            } else {
                str2 = "";
            }
            if (jSONObject.has("interact_id")) {
                str3 = jSONObject.getString("interact_id");
            } else {
                str3 = "";
            }
            if (str2 == "") {
                return null;
            }
            byte[] hexStringToBytes = hexStringToBytes(str2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(hexStringToBytes.length);
            allocateDirect.put(hexStringToBytes);
            allocateDirect.position(0);
            FindContourInfo contourInfoFromByteBuffer = getContourInfoFromByteBuffer(allocateDirect);
            if (contourInfoFromByteBuffer != null) {
                contourInfoFromByteBuffer.mInteractId = str3;
            }
            return contourInfoFromByteBuffer;
        } catch (Exception unused) {
            return null;
        }
    }

    public static FindContourInfo getContourInfoFromByteBuffer(ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        byteBuffer.position(0);
        if (remaining < 4) {
            return null;
        }
        byte[] bArr2 = new byte[4];
        int i4 = 0;
        do {
            bArr2[i4] = bArr[i4];
            i4++;
        } while (i4 < 4);
        String str = new String(bArr2);
        if (!(str.equals(SEI_HEAD_APP_DATA) || str.equals(SEI_HEAD_MATTING_DATA))) {
            return null;
        }
        int i5 = remaining - 4;
        byte[] bArr3 = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            bArr3[i6] = bArr[i6 + 4];
        }
        byte[] bArr4 = new byte[4096];
        try {
            bArr4 = unCompress(bArr3);
        } catch (DataFormatException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bArr4.length).order(ByteOrder.nativeOrder());
        order.put(bArr4);
        order.flip();
        FindContourInfo findContourInfo = new FindContourInfo();
        int i7 = order.get() & 255;
        if (i7 == 0) {
            return null;
        }
        int i8 = order.get() & 255;
        int i9 = order.get() & 255;
        int i10 = order.get() & 255;
        findContourInfo.mSize = i7;
        findContourInfo.mWidth = i8;
        findContourInfo.mHeight = i9;
        findContourInfo.mContourItemSize = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = order.getShort() & 65535;
            FindContourInfo.ContourItem contourItem = new FindContourInfo.ContourItem();
            contourItem.counts = i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                if (i15 == 0) {
                    i2 = order.getShort() & 255;
                    i3 = order.getShort() & 255;
                } else {
                    i2 = order.getShort();
                    i3 = order.getShort();
                }
                FindContourInfo.ContourPoint contourPoint = new FindContourInfo.ContourPoint();
                if (i15 == 0) {
                    i13 = i2;
                    i14 = i3;
                } else {
                    i13 += i2;
                    i14 += i3;
                }
                contourPoint.x = i13;
                contourPoint.y = i14;
                contourItem.pointsList.add(contourPoint);
            }
            findContourInfo.contourItemsList.add(contourItem);
        }
        return findContourInfo;
    }
}
