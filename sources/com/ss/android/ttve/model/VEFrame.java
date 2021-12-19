package com.ss.android.ttve.model;

import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.EGLContext;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

public class VEFrame implements Parcelable {
    public static final Parcelable.Creator<VEFrame> CREATOR = new Parcelable.Creator<VEFrame>() {
        /* class com.ss.android.ttve.model.VEFrame.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37647);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEFrame[] newArray(int i2) {
            return new VEFrame[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEFrame createFromParcel(Parcel parcel) {
            return new VEFrame(parcel);
        }
    };
    protected a format = a.TEPixFmt_Count;
    protected boolean fromFrontCamera;
    protected int height;
    protected FrameBase mInternalFrame;
    private HashMap<String, String> mMetaDataMap;
    protected int rotation;
    protected long timeStamp;
    protected int width;

    public int describeContents() {
        return 0;
    }

    public static class ByteArrayFrame extends FrameBase {
        byte[] byteArray;

        static {
            Covode.recordClassIndex(37649);
        }

        public byte[] getByteArray() {
            return this.byteArray;
        }

        public ByteArrayFrame(byte[] bArr) {
            this.byteArray = bArr;
        }
    }

    public static class ByteBufferFrame extends FrameBase {
        ByteBuffer byteBuffer;

        static {
            Covode.recordClassIndex(37650);
        }

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public ByteBufferFrame(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }
    }

    public static class FrameBase implements Parcelable {
        public static final Parcelable.Creator<FrameBase> CREATOR = new Parcelable.Creator<FrameBase>() {
            /* class com.ss.android.ttve.model.VEFrame.FrameBase.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37652);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FrameBase[] newArray(int i2) {
                return new FrameBase[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FrameBase createFromParcel(Parcel parcel) {
                return new FrameBase(parcel);
            }
        };

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
        }

        public FrameBase() {
        }

        static {
            Covode.recordClassIndex(37651);
        }

        protected FrameBase(Parcel parcel) {
        }
    }

    public static class IntArrayFrame extends FrameBase {
        int[] intArray;

        static {
            Covode.recordClassIndex(37653);
        }

        public int[] getIntArray() {
            return this.intArray;
        }

        public IntArrayFrame(int[] iArr) {
            this.intArray = iArr;
        }
    }

    public a getFormat() {
        return this.format;
    }

    public FrameBase getFrame() {
        return this.mInternalFrame;
    }

    public int getHeight() {
        return this.height;
    }

    public HashMap<String, String> getMetaData() {
        return this.mMetaDataMap;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isFromFrontCamera() {
        return this.fromFrontCamera;
    }

    public static class YUVPlansFrame extends FrameBase {
        e planes;

        static {
            Covode.recordClassIndex(37655);
        }

        public Image.Plane[] getPlanes() {
            return this.planes.f61182a;
        }

        public YUVPlansFrame(e eVar) {
            this.planes = eVar;
        }
    }

    public int getFormatOrdinal() {
        return this.format.ordinal();
    }

    static {
        Covode.recordClassIndex(37646);
    }

    public Image.Plane[] getYUVPlanes() {
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            an.d("VEFrame", "get yuv data failed, no internal frame!");
            return null;
        } else if (frameBase instanceof YUVPlansFrame) {
            return ((YUVPlansFrame) frameBase).getPlanes();
        } else {
            return null;
        }
    }

    /* renamed from: com.ss.android.ttve.model.VEFrame$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f61146a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 37648(0x9310, float:5.2756E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ttve.model.VEFrame$a[] r0 = com.ss.android.ttve.model.VEFrame.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ttve.model.VEFrame.AnonymousClass2.f61146a = r2
                com.ss.android.ttve.model.VEFrame$a r0 = com.ss.android.ttve.model.VEFrame.a.TEPIXEL_FORMAT_YUV420     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ttve.model.VEFrame.AnonymousClass2.f61146a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ttve.model.VEFrame$a r0 = com.ss.android.ttve.model.VEFrame.a.TEPIXEL_FORMAT_JPEG     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.model.VEFrame.AnonymousClass2.<clinit>():void");
        }
    }

    public enum b {
        OP_SCALE,
        OP_ROTATION,
        OP_CONVERT,
        OP_COPY;

        static {
            Covode.recordClassIndex(37657);
        }
    }

    public byte[] getJpegData() {
        if (this.mInternalFrame == null) {
            an.d("VEFrame", "get jpeg data failed, no internal frame!");
            return null;
        } else if (this.format != a.TEPIXEL_FORMAT_JPEG) {
            an.d("VEFrame", "get jpeg data failed, internal frame format: " + this.format);
            return null;
        } else {
            FrameBase frameBase = this.mInternalFrame;
            if (frameBase instanceof ByteArrayFrame) {
                return ((ByteArrayFrame) frameBase).getByteArray();
            }
            return null;
        }
    }

    public Bitmap toBitmap() {
        MethodCollector.i(3221);
        FrameBase frameBase = this.mInternalFrame;
        if (frameBase == null) {
            MethodCollector.o(3221);
            return null;
        } else if ((frameBase instanceof ByteBufferFrame) && this.format == a.TEPixFmt_RGBA8 && this.rotation == 0) {
            ByteBuffer byteBuffer = ((ByteBufferFrame) this.mInternalFrame).byteBuffer;
            byteBuffer.rewind();
            Bitmap createBitmap = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(byteBuffer);
            MethodCollector.o(3221);
            return createBitmap;
        } else {
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Conversion to bitmap is not supported!!!");
            MethodCollector.o(3221);
            throw unsupportedOperationException;
        }
    }

    public enum a {
        TEPixFmt_YUV420P,
        TEPixFmt_YUYV422,
        TEPixFmt_YUV422P,
        TEPixFmt_UYVY422,
        TEPixFmt_NV12,
        TEPixFmt_NV21,
        TEPixFmt_GRAY8,
        TEPixFmt_RGB8,
        TEPixFmt_BGR8,
        TEPixFmt_RGB233,
        TEPixFmt_BGR233,
        TEPixFmt_ARGB8,
        TEPixFmt_RGBA8,
        TEPixFmt_BGRA8,
        TEPixFmt_OpenGL_RGB8,
        TEPixFmt_OpenGL_RGBA8,
        TEPIXEL_FORMAT_JPEG,
        TEPIXEL_FORMAT_YUV420,
        TEPixFmt_OpenGL_RGB565,
        TEPixFmt_RGB565,
        TEPixFmt_Count;

        static {
            Covode.recordClassIndex(37656);
        }
    }

    public void setFromFrontCamera(boolean z) {
        this.fromFrontCamera = z;
    }

    public void setMetaData(HashMap<String, String> hashMap) {
        this.mMetaDataMap = hashMap;
    }

    public static ByteBuffer allocateFrame(int i2) {
        return ByteBuffer.allocateDirect(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    protected VEFrame(Parcel parcel) {
        a aVar;
        boolean z;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            aVar = null;
        } else {
            aVar = a.values()[readInt];
        }
        this.format = aVar;
        this.mInternalFrame = (FrameBase) parcel.readParcelable(FrameBase.class.getClassLoader());
        this.rotation = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.timeStamp = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.fromFrontCamera = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0100, code lost:
        if (r5 == null) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ea A[SYNTHETIC, Splitter:B:34:0x00ea] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dumpImageToPath(java.lang.String r9) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.model.VEFrame.dumpImageToPath(java.lang.String):void");
    }

    public static class TextureFrame extends FrameBase {

        /* renamed from: a  reason: collision with root package name */
        public EGLContext f61147a;

        /* renamed from: b  reason: collision with root package name */
        public int f61148b;

        static {
            Covode.recordClassIndex(37654);
        }

        public TextureFrame(EGLContext eGLContext, int i2) {
            this.f61147a = eGLContext;
            this.f61148b = i2;
        }
    }

    public static VEFrame createByteBufferFrame(Bitmap bitmap, long j2) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(bitmap.getByteCount()).order(ByteOrder.LITTLE_ENDIAN);
        bitmap.copyPixelsToBuffer(order);
        VEFrame vEFrame = new VEFrame(bitmap.getWidth(), bitmap.getHeight(), 0, j2, a.TEPixFmt_RGBA8);
        vEFrame.mInternalFrame = new ByteBufferFrame(order);
        return vEFrame;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int ordinal;
        a aVar = this.format;
        if (aVar == null) {
            ordinal = -1;
        } else {
            ordinal = aVar.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeParcelable(this.mInternalFrame, i2);
        parcel.writeInt(this.rotation);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.timeStamp);
        parcel.writeByte(this.fromFrontCamera ? (byte) 1 : 0);
    }

    public VEFrame(int i2, int i3, int i4, long j2, a aVar) {
        this.width = i2;
        this.height = i3;
        this.rotation = i4;
        this.timeStamp = j2;
        this.format = aVar;
    }

    private static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, int i5) {
        return createByteBufferFrame(byteBuffer, i2, i3, i4, j2, a.values()[i5]);
    }

    public static VEFrame createByteArrayFrame(byte[] bArr, int i2, int i3, int i4, long j2, a aVar) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j2, aVar);
        vEFrame.mInternalFrame = new ByteArrayFrame(bArr);
        return vEFrame;
    }

    public static VEFrame createByteBufferFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2, a aVar) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j2, aVar);
        vEFrame.mInternalFrame = new ByteBufferFrame(byteBuffer);
        return vEFrame;
    }

    public static VEFrame createIntArrayFrame(int[] iArr, int i2, int i3, int i4, long j2, a aVar) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j2, aVar);
        vEFrame.mInternalFrame = new IntArrayFrame(iArr);
        return vEFrame;
    }

    public static VEFrame createYUVPlanFrame(e eVar, int i2, int i3, int i4, long j2, a aVar) {
        VEFrame vEFrame = new VEFrame(i2, i3, i4, j2, aVar);
        vEFrame.mInternalFrame = new YUVPlansFrame(eVar);
        return vEFrame;
    }

    public static VEFrame createTextureFrame(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, a aVar) {
        VEFrame vEFrame = new VEFrame(i3, i4, i5, j2, aVar);
        vEFrame.mInternalFrame = new TextureFrame(eGLContext, i2);
        return vEFrame;
    }
}
