package com.bytedance.frameworks.baselib.network.http.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28993a = h.class.getSimpleName();
    private static final long serialVersionUID = 6374381323722046732L;

    /* renamed from: b  reason: collision with root package name */
    private transient e f28994b;
    private long whenCreated = System.currentTimeMillis();

    public static int com_bytedance_frameworks_baselib_network_http_impl_SerializableHttpCookie_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2, Throwable th) {
        return 0;
    }

    public e getHttpCookie() {
        return this.f28994b;
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.whenCreated);
    }

    public int hashCode() {
        return this.f28994b.hashCode();
    }

    static {
        Covode.recordClassIndex(17003);
    }

    public boolean hasExpired() {
        long j2 = this.f28994b.f28964e;
        if (j2 != -1 && (System.currentTimeMillis() - this.whenCreated) / 1000 > j2) {
            return true;
        }
        return false;
    }

    public String encode() {
        MethodCollector.i(1370);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            String a2 = a(byteArrayOutputStream.toByteArray());
            MethodCollector.o(1370);
            return a2;
        } catch (IOException e2) {
            com_bytedance_frameworks_baselib_network_http_impl_SerializableHttpCookie_com_ss_android_ugc_aweme_lancet_LogLancet_d(f28993a, "IOException in encodeCookie", e2);
            MethodCollector.o(1370);
            return null;
        }
    }

    public h(e eVar) {
        this.f28994b = eVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f28994b.equals(obj);
        }
        if (obj instanceof h) {
            return this.f28994b.equals(((h) obj).f28994b);
        }
        return false;
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i2 = b2 & 255;
            if (i2 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    public static h decode(String str) {
        MethodCollector.i(1376);
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        try {
            h hVar = (h) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            MethodCollector.o(1376);
            return hVar;
        } catch (IOException e2) {
            com_bytedance_frameworks_baselib_network_http_impl_SerializableHttpCookie_com_ss_android_ugc_aweme_lancet_LogLancet_d(f28993a, "IOException in decodeCookie", e2);
            MethodCollector.o(1376);
            return null;
        } catch (ClassNotFoundException e3) {
            com_bytedance_frameworks_baselib_network_http_impl_SerializableHttpCookie_com_ss_android_ugc_aweme_lancet_LogLancet_d(f28993a, "ClassNotFoundException in decodeCookie", e3);
            MethodCollector.o(1376);
            return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeObject(this.f28994b.f28965f);
        objectOutputStream.writeObject(this.f28994b.f28970k);
        objectOutputStream.writeObject(this.f28994b.f28960a);
        objectOutputStream.writeObject(this.f28994b.f28961b);
        objectOutputStream.writeObject(this.f28994b.f28963d);
        objectOutputStream.writeLong(this.f28994b.f28964e);
        objectOutputStream.writeObject(this.f28994b.f28966g);
        objectOutputStream.writeObject(this.f28994b.f28967h);
        objectOutputStream.writeInt(this.f28994b.f28971l);
        objectOutputStream.writeBoolean(this.f28994b.f28968i);
        objectOutputStream.writeBoolean(this.f28994b.f28962c);
        objectOutputStream.writeBoolean(this.f28994b.f28969j);
        objectOutputStream.writeLong(this.whenCreated);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        e eVar = new e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f28994b = eVar;
        eVar.f28960a = (String) objectInputStream.readObject();
        this.f28994b.f28961b = (String) objectInputStream.readObject();
        this.f28994b.a((String) objectInputStream.readObject());
        this.f28994b.f28964e = objectInputStream.readLong();
        this.f28994b.f28966g = (String) objectInputStream.readObject();
        this.f28994b.f28967h = (String) objectInputStream.readObject();
        e eVar2 = this.f28994b;
        int readInt = objectInputStream.readInt();
        if (readInt == 0 || readInt == 1) {
            eVar2.f28971l = readInt;
            this.f28994b.f28968i = objectInputStream.readBoolean();
            this.f28994b.f28962c = objectInputStream.readBoolean();
            this.f28994b.f28969j = objectInputStream.readBoolean();
            this.whenCreated = objectInputStream.readLong();
            return;
        }
        throw new IllegalArgumentException("Bad version: ".concat(String.valueOf(readInt)));
    }

    public static int getEffectivePort(String str, int i2) {
        if (i2 != -1) {
            return i2;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
