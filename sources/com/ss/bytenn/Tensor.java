package com.ss.bytenn;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class Tensor implements Parcelable {
    public static final Parcelable.Creator<Tensor> CREATOR = new Parcelable.Creator<Tensor>() {
        /* class com.ss.bytenn.Tensor.AnonymousClass1 */

        static {
            Covode.recordClassIndex(100706);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Tensor[] newArray(int i2) {
            return new Tensor[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Tensor createFromParcel(Parcel parcel) {
            return new Tensor(parcel);
        }
    };
    private int channel;
    private DataFormat dataFormat;
    private DataType dataType;
    private int height;
    private String name;
    private ByteBuffer raw_data;
    private int width;

    public int describeContents() {
        return 0;
    }

    public int getChannel() {
        return this.channel;
    }

    public ByteBuffer getData() {
        return this.raw_data;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public int getOrdinalOfDataFormat() {
        return this.dataFormat.ordinal();
    }

    public int getOrdinalOfDataType() {
        return this.dataType.ordinal();
    }

    static {
        Covode.recordClassIndex(100705);
    }

    public Tensor() {
        this.dataFormat = DataFormat.NCHW;
        this.dataType = DataType.Float;
        this.name = "";
    }

    public enum DataFormat {
        NCHW,
        NHWC;

        static {
            Covode.recordClassIndex(100707);
        }
    }

    public enum DataType {
        U8,
        Int8,
        Int16,
        Uint16,
        Float,
        Fp16,
        Double;

        static {
            Covode.recordClassIndex(100708);
        }
    }

    public void setChannel(int i2) {
        this.channel = i2;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    public void setData(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.raw_data = byteBuffer;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }

    protected Tensor(Parcel parcel) {
        this.dataFormat = DataFormat.values()[parcel.readInt()];
        this.dataType = DataType.values()[parcel.readInt()];
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.channel = parcel.readInt();
        parcel.readByteArray(null);
        this.raw_data = ByteBuffer.wrap(null);
        this.name = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.dataFormat.ordinal());
        parcel.writeInt(this.dataType.ordinal());
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.channel);
        parcel.writeByteArray(new byte[this.raw_data.remaining()]);
        parcel.writeString(this.name);
    }

    public void init(DataFormat dataFormat2, DataType dataType2, int i2, int i3, int i4, ByteBuffer byteBuffer, String str) {
        this.dataFormat = dataFormat2;
        this.dataType = dataType2;
        this.width = i2;
        this.height = i3;
        this.channel = i4;
        if (byteBuffer.isDirect()) {
            this.raw_data = byteBuffer;
            this.name = str;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }
}
