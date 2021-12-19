package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.soloader.e;
import com.facebook.soloader.l;
import java.io.File;
import java.util.zip.ZipEntry;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final int f49192a;

    static {
        Covode.recordClassIndex(30756);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.l, com.facebook.soloader.e
    public final l.e a() {
        return new C1194a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.l
    public final byte[] b() {
        File canonicalFile = this.f49201d.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(j.a(this.f49214f));
            if ((this.f49192a & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.f49214f.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte((byte) 1);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                return marshall;
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte((byte) 1);
                byte[] marshall2 = obtain.marshall();
                obtain.recycle();
                return marshall2;
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            byte[] marshall3 = obtain.marshall();
            obtain.recycle();
            return marshall3;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: com.facebook.soloader.a$a  reason: collision with other inner class name */
    protected class C1194a extends e.b {

        /* renamed from: e  reason: collision with root package name */
        private File f49194e;

        /* renamed from: f  reason: collision with root package name */
        private final int f49195f;

        static {
            Covode.recordClassIndex(30757);
        }

        C1194a(e eVar) {
            super(eVar);
            this.f49194e = new File(a.this.f49214f.getApplicationInfo().nativeLibraryDir);
            this.f49195f = a.this.f49192a;
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.soloader.e.b
        public final boolean a(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(a.this.f49215g)) {
                a.this.f49215g = null;
                com.a.a("allowing consideration of corrupted lib %s", new Object[]{str});
            } else if ((this.f49195f & 1) != 0) {
                File file = new File(this.f49194e, str);
                if (!file.isFile()) {
                    com.a.a("allowing considering of %s: %s not in system lib dir", new Object[]{name, str});
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        return false;
                    }
                    com.a.a("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                }
            }
            return true;
        }
    }

    public a(Context context, String str, int i2) {
        super(context, str, new File(context.getApplicationInfo().sourceDir), "^lib/([^/]+)/([^/]+\\.so)$");
        this.f49192a = i2;
    }
}
