package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.lang.reflect.Array;
import k.i;

public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    static {
        Covode.recordClassIndex(36095);
    }

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        private final ProtoAdapter<M> adapter;

        static {
            Covode.recordClassIndex(36096);
        }

        ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.adapter = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public final M[] newArray(int i2) {
            return (M[]) ((Object[]) Array.newInstance(this.adapter.javaType, i2));
        }

        @Override // android.os.Parcelable.Creator
        public final M createFromParcel(Parcel parcel) {
            try {
                return this.adapter.decode(parcel.createByteArray());
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new ProtoAdapterCreator(protoAdapter);
    }

    public AndroidMessage(ProtoAdapter<M> protoAdapter, i iVar) {
        super(protoAdapter, iVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(encode());
    }
}
