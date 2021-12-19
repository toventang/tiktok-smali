package com.lynx.tasm.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.j;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55742a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f55743b;

    /* renamed from: c  reason: collision with root package name */
    private static final Charset f55744c = Charset.forName("UTF8");

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.b.a$a  reason: collision with other inner class name */
    public static final class C1258a extends ByteArrayOutputStream {
        static {
            Covode.recordClassIndex(34860);
        }

        /* access modifiers changed from: package-private */
        public final byte[] a() {
            return this.buf;
        }

        C1258a() {
            MethodCollector.i(11880);
            MethodCollector.o(11880);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(34859);
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f55743b = z;
    }

    private Object c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return a(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    private static int b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i2 = byteBuffer.get() & 255;
            if (i2 < 254) {
                return i2;
            }
            if (i2 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public final Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            Object c2 = c(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                return c2;
            }
            throw new IllegalArgumentException("Message corrupted");
        } catch (IllegalArgumentException e2) {
            LynxEnv.b().o.a(new j(e2.toString(), -3));
            return null;
        }
    }

    public final ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        C1258a aVar = new C1258a();
        try {
            a(aVar, obj, new LinkedList<>());
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
            allocateDirect.put(aVar.a(), 0, aVar.size());
            return allocateDirect;
        } catch (IllegalArgumentException e2) {
            LynxEnv.b().o.a(new j(e2.toString(), -3));
            return null;
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        MethodCollector.i(14317);
        a(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        MethodCollector.o(14317);
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        MethodCollector.i(14280);
        if (i2 < 254) {
            byteArrayOutputStream.write(i2);
            MethodCollector.o(14280);
        } else if (i2 <= 65535) {
            byteArrayOutputStream.write(254);
            if (f55743b) {
                byteArrayOutputStream.write(i2);
                byteArrayOutputStream.write(i2 >>> 8);
                MethodCollector.o(14280);
                return;
            }
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2);
            MethodCollector.o(14280);
        } else {
            byteArrayOutputStream.write(255);
            b(byteArrayOutputStream, i2);
            MethodCollector.o(14280);
        }
    }

    private static boolean a(Collection<Object> collection, Object obj) {
        if (obj == null) {
            return false;
        }
        for (Object obj2 : collection) {
            if (obj == obj2) {
                return true;
            }
        }
        return false;
    }

    private static void b(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        MethodCollector.i(14281);
        if (f55743b) {
            byteArrayOutputStream.write(i2);
            byteArrayOutputStream.write(i2 >>> 8);
            byteArrayOutputStream.write(i2 >>> 16);
            byteArrayOutputStream.write(i2 >>> 24);
            MethodCollector.o(14281);
            return;
        }
        byteArrayOutputStream.write(i2 >>> 24);
        byteArrayOutputStream.write(i2 >>> 16);
        byteArrayOutputStream.write(i2 >>> 8);
        byteArrayOutputStream.write(i2);
        MethodCollector.o(14281);
    }

    private Object a(byte b2, ByteBuffer byteBuffer) {
        int i2 = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                int position = byteBuffer.position() % 8;
                if (position != 0) {
                    byteBuffer.position((byteBuffer.position() + 8) - position);
                }
                return Double.valueOf(byteBuffer.getDouble());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                byte[] bArr = new byte[b(byteBuffer)];
                byteBuffer.get(bArr);
                return new String(bArr, f55744c);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                int b3 = b(byteBuffer);
                ArrayList arrayList = new ArrayList(b3);
                while (i2 < b3) {
                    arrayList.add(c(byteBuffer));
                    i2++;
                }
                return arrayList;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                int b4 = b(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i2 < b4) {
                    hashMap.put(c(byteBuffer), c(byteBuffer));
                    i2++;
                }
                return hashMap;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    private static void a(ByteArrayOutputStream byteArrayOutputStream, long j2) {
        MethodCollector.i(14283);
        if (f55743b) {
            byteArrayOutputStream.write((byte) ((int) j2));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j2 >>> 56)));
            MethodCollector.o(14283);
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j2 >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j2));
        MethodCollector.o(14283);
    }

    private void a(ByteArrayOutputStream byteArrayOutputStream, Object obj, LinkedList<Object> linkedList) {
        int i2;
        MethodCollector.i(14322);
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            MethodCollector.o(14322);
        } else if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            byteArrayOutputStream.write(i2);
            MethodCollector.o(14322);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                b(byteArrayOutputStream, ((Number) obj).intValue());
                MethodCollector.o(14322);
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                a(byteArrayOutputStream, ((Long) obj).longValue());
                MethodCollector.o(14322);
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(5);
                int size = byteArrayOutputStream.size() % 8;
                if (size != 0) {
                    for (int i3 = 0; i3 < 8 - size; i3++) {
                        byteArrayOutputStream.write(0);
                    }
                }
                a(byteArrayOutputStream, Double.doubleToLongBits(((Number) obj).doubleValue()));
                MethodCollector.o(14322);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                MethodCollector.o(14322);
                throw illegalArgumentException;
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(6);
            a(byteArrayOutputStream, ((String) obj).getBytes(f55744c));
            MethodCollector.o(14322);
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            if (list.isEmpty() || !a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(7);
                a(byteArrayOutputStream, list.size());
                for (Object obj2 : list) {
                    a(byteArrayOutputStream, obj2, linkedList);
                }
                linkedList.removeLast();
                MethodCollector.o(14322);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle array!");
            MethodCollector.o(14322);
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.isEmpty() || !a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(8);
                a(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    a(byteArrayOutputStream, entry.getKey(), linkedList);
                    a(byteArrayOutputStream, entry.getValue(), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.o(14322);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle dict!");
            MethodCollector.o(14322);
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject.length() <= 0 || !a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(8);
                a(byteArrayOutputStream, jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    a(byteArrayOutputStream, next, linkedList);
                    a(byteArrayOutputStream, jSONObject.opt(next), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.o(14322);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle JSONObject!");
            MethodCollector.o(14322);
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() <= 0 || !a(linkedList, obj)) {
                linkedList.addLast(obj);
                byteArrayOutputStream.write(7);
                a(byteArrayOutputStream, jSONArray.length());
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    a(byteArrayOutputStream, jSONArray.opt(i4), linkedList);
                }
                linkedList.removeLast();
                MethodCollector.o(14322);
                return;
            }
            byteArrayOutputStream.write(0);
            new IllegalArgumentException("writeValue has cycle JSONArray!");
            MethodCollector.o(14322);
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(9);
            a(byteArrayOutputStream, (byte[]) obj);
            MethodCollector.o(14322);
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unsupported type: " + obj.getClass() + " value: " + obj);
            MethodCollector.o(14322);
            throw illegalArgumentException2;
        }
    }
}
