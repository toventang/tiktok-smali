package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WsChannelMsg implements Parcelable {
    public static final Parcelable.Creator<WsChannelMsg> CREATOR = new Parcelable.Creator<WsChannelMsg>() {
        /* class com.bytedance.common.wschannel.model.WsChannelMsg.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16074);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WsChannelMsg[] newArray(int i2) {
            return new WsChannelMsg[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WsChannelMsg createFromParcel(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static WsChannelMsg f27294c = new WsChannelMsg();

    /* renamed from: d  reason: collision with root package name */
    public long f27295d;

    /* renamed from: e  reason: collision with root package name */
    public long f27296e;

    /* renamed from: f  reason: collision with root package name */
    public int f27297f;

    /* renamed from: g  reason: collision with root package name */
    public int f27298g;

    /* renamed from: h  reason: collision with root package name */
    public List<MsgHeader> f27299h;

    /* renamed from: i  reason: collision with root package name */
    public String f27300i;

    /* renamed from: j  reason: collision with root package name */
    public String f27301j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f27302k;

    /* renamed from: l  reason: collision with root package name */
    public ComponentName f27303l;

    /* renamed from: m  reason: collision with root package name */
    public int f27304m;
    public NewMsgTimeHolder n;
    public transient long o;

    public int describeContents() {
        return 0;
    }

    public WsChannelMsg() {
    }

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new Parcelable.Creator<MsgHeader>() {
            /* class com.bytedance.common.wschannel.model.WsChannelMsg.MsgHeader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16076);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MsgHeader[] newArray(int i2) {
                return new MsgHeader[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MsgHeader createFromParcel(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f27305a = parcel.readString();
                msgHeader.f27306b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f27305a;

        /* renamed from: b  reason: collision with root package name */
        public String f27306b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(16075);
        }

        public String toString() {
            return "MsgHeader{key='" + this.f27305a + '\'' + ", value='" + this.f27306b + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f27305a);
            parcel.writeString(this.f27306b);
        }
    }

    public final byte[] a() {
        if (this.f27302k == null) {
            this.f27302k = new byte[1];
        }
        return this.f27302k;
    }

    static {
        Covode.recordClassIndex(16073);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f27307a;

        /* renamed from: b  reason: collision with root package name */
        public int f27308b;

        /* renamed from: c  reason: collision with root package name */
        public int f27309c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f27310d;

        /* renamed from: e  reason: collision with root package name */
        public String f27311e = "";

        /* renamed from: f  reason: collision with root package name */
        public String f27312f = "";

        /* renamed from: g  reason: collision with root package name */
        public long f27313g;

        /* renamed from: h  reason: collision with root package name */
        public ComponentName f27314h;

        /* renamed from: i  reason: collision with root package name */
        private final int f27315i;

        /* renamed from: j  reason: collision with root package name */
        private Map<String, String> f27316j = new HashMap();

        static {
            Covode.recordClassIndex(16077);
        }

        public final WsChannelMsg a() {
            if (this.f27315i <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f27308b <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f27309c <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f27310d != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : this.f27316j.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f27305a = entry.getKey();
                    msgHeader.f27306b = entry.getValue();
                    arrayList.add(msgHeader);
                }
                return new WsChannelMsg(this.f27315i, this.f27313g, this.f27307a, this.f27308b, this.f27309c, arrayList, this.f27312f, this.f27311e, this.f27310d, this.f27314h);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        public static a a(int i2) {
            return new a(i2);
        }

        public a(int i2) {
            this.f27315i = i2;
        }

        public final a a(String str, String str2) {
            this.f27316j.put(str, str2);
            return this;
        }
    }

    public String toString() {
        return "WsChannelMsg{, channelId = " + this.f27304m + ", logId=" + this.f27296e + ", service=" + this.f27297f + ", method=" + this.f27298g + ", msgHeaders=" + this.f27299h + ", payloadEncoding='" + this.f27300i + '\'' + ", payloadType='" + this.f27301j + '\'' + ", payload=" + Arrays.toString(this.f27302k) + ", replayToComponentName=" + this.f27303l + '}';
    }

    public WsChannelMsg(WsChannelMsg wsChannelMsg) {
        this.f27295d = wsChannelMsg.f27295d;
        this.f27296e = wsChannelMsg.f27296e;
        this.f27297f = wsChannelMsg.f27297f;
        this.f27298g = wsChannelMsg.f27298g;
        this.f27299h = wsChannelMsg.f27299h;
        this.f27302k = wsChannelMsg.a();
        this.f27300i = wsChannelMsg.f27300i;
        this.f27301j = wsChannelMsg.f27301j;
        this.f27304m = wsChannelMsg.f27304m;
        this.f27303l = wsChannelMsg.f27303l;
        this.n = wsChannelMsg.n;
    }

    protected WsChannelMsg(Parcel parcel) {
        this.f27295d = parcel.readLong();
        this.f27296e = parcel.readLong();
        this.f27297f = parcel.readInt();
        this.f27298g = parcel.readInt();
        this.f27299h = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f27300i = parcel.readString();
        this.f27301j = parcel.readString();
        this.f27302k = parcel.createByteArray();
        this.f27303l = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f27304m = parcel.readInt();
        this.n = (NewMsgTimeHolder) parcel.readParcelable(NewMsgTimeHolder.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f27295d);
        parcel.writeLong(this.f27296e);
        parcel.writeInt(this.f27297f);
        parcel.writeInt(this.f27298g);
        parcel.writeTypedList(this.f27299h);
        parcel.writeString(this.f27300i);
        parcel.writeString(this.f27301j);
        parcel.writeByteArray(this.f27302k);
        parcel.writeParcelable(this.f27303l, i2);
        parcel.writeInt(this.f27304m);
        parcel.writeParcelable(this.n, i2);
    }

    public WsChannelMsg(int i2, long j2, long j3, int i3, int i4, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f27304m = i2;
        this.f27295d = j2;
        this.f27296e = j3;
        this.f27297f = i3;
        this.f27298g = i4;
        this.f27299h = list;
        this.f27300i = str;
        this.f27301j = str2;
        this.f27302k = bArr;
        this.f27303l = componentName;
    }
}
