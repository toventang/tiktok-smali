package com.bytedance.android.livesdkapi.ws;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveWsMessage implements Parcelable {
    public static final Parcelable.Creator<LiveWsMessage> CREATOR = new Parcelable.Creator<LiveWsMessage>() {
        /* class com.bytedance.android.livesdkapi.ws.LiveWsMessage.AnonymousClass1 */

        static {
            Covode.recordClassIndex(13906);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LiveWsMessage[] newArray(int i2) {
            return new LiveWsMessage[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LiveWsMessage createFromParcel(Parcel parcel) {
            return new LiveWsMessage(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static LiveWsMessage f23382a = new LiveWsMessage();

    /* renamed from: b  reason: collision with root package name */
    public long f23383b;

    /* renamed from: c  reason: collision with root package name */
    public long f23384c;

    /* renamed from: d  reason: collision with root package name */
    public int f23385d;

    /* renamed from: e  reason: collision with root package name */
    public int f23386e;

    /* renamed from: f  reason: collision with root package name */
    public List<MsgHeader> f23387f;

    /* renamed from: g  reason: collision with root package name */
    public String f23388g;

    /* renamed from: h  reason: collision with root package name */
    public String f23389h;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f23390i;

    /* renamed from: j  reason: collision with root package name */
    public ComponentName f23391j;

    /* renamed from: k  reason: collision with root package name */
    public int f23392k;

    public int describeContents() {
        return 0;
    }

    private LiveWsMessage() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f23395a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public long f23396b;

        /* renamed from: c  reason: collision with root package name */
        public int f23397c;

        /* renamed from: d  reason: collision with root package name */
        public int f23398d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f23399e;

        /* renamed from: f  reason: collision with root package name */
        public String f23400f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f23401g = "";

        /* renamed from: h  reason: collision with root package name */
        public long f23402h;

        /* renamed from: i  reason: collision with root package name */
        public ComponentName f23403i;

        /* renamed from: j  reason: collision with root package name */
        private final int f23404j;

        static {
            Covode.recordClassIndex(13909);
        }

        public static a a() {
            return new a(10001);
        }

        public final LiveWsMessage b() {
            if (this.f23404j <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f23397c <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f23398d <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f23399e != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : this.f23395a.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f23393a = entry.getKey();
                    msgHeader.f23394b = entry.getValue();
                    arrayList.add(msgHeader);
                }
                return new LiveWsMessage(this.f23404j, this.f23402h, this.f23396b, this.f23397c, this.f23398d, arrayList, this.f23401g, this.f23400f, this.f23399e, this.f23403i);
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        public a(int i2) {
            this.f23404j = i2;
        }
    }

    public static class MsgHeader implements Parcelable {
        public static final Parcelable.Creator<MsgHeader> CREATOR = new Parcelable.Creator<MsgHeader>() {
            /* class com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(13908);
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
                msgHeader.f23393a = parcel.readString();
                msgHeader.f23394b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f23393a;

        /* renamed from: b  reason: collision with root package name */
        public String f23394b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(13907);
        }

        public String toString() {
            return "MsgHeader{key='" + this.f23393a + '\'' + ", value='" + this.f23394b + '\'' + '}';
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f23393a);
            parcel.writeString(this.f23394b);
        }
    }

    public final byte[] a() {
        if (this.f23390i == null) {
            this.f23390i = new byte[1];
        }
        return this.f23390i;
    }

    static {
        Covode.recordClassIndex(13905);
    }

    public String toString() {
        return "LiveWsMessage{, channelId = " + this.f23392k + ", logId=" + this.f23384c + ", service=" + this.f23385d + ", method=" + this.f23386e + ", msgHeaders=" + this.f23387f + ", payloadEncoding='" + this.f23388g + '\'' + ", payloadType='" + this.f23389h + '\'' + ", payload=" + Arrays.toString(this.f23390i) + ", replayToComponentName=" + this.f23391j + '}';
    }

    protected LiveWsMessage(Parcel parcel) {
        this.f23383b = parcel.readLong();
        this.f23384c = parcel.readLong();
        this.f23385d = parcel.readInt();
        this.f23386e = parcel.readInt();
        this.f23387f = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f23388g = parcel.readString();
        this.f23389h = parcel.readString();
        this.f23390i = parcel.createByteArray();
        this.f23391j = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f23392k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f23383b);
        parcel.writeLong(this.f23384c);
        parcel.writeInt(this.f23385d);
        parcel.writeInt(this.f23386e);
        parcel.writeTypedList(this.f23387f);
        parcel.writeString(this.f23388g);
        parcel.writeString(this.f23389h);
        parcel.writeByteArray(this.f23390i);
        parcel.writeParcelable(this.f23391j, i2);
        parcel.writeInt(this.f23392k);
    }

    public LiveWsMessage(int i2, long j2, long j3, int i3, int i4, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f23392k = i2;
        this.f23383b = j2;
        this.f23384c = j3;
        this.f23385d = i3;
        this.f23386e = i4;
        this.f23387f = list;
        this.f23388g = str;
        this.f23389h = str2;
        this.f23390i = bArr;
        this.f23391j = componentName;
    }
}
