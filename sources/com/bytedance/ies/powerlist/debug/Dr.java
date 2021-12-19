package com.bytedance.ies.powerlist.debug;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class Dr {

    /* renamed from: a  reason: collision with root package name */
    public static a f34270a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f34271b;

    /* renamed from: c  reason: collision with root package name */
    public static final Dr f34272c = new Dr();

    public static final class Tracker implements Parcelable {
        public static final a CREATOR = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final h f34273a;

        /* renamed from: b  reason: collision with root package name */
        public long f34274b;

        /* renamed from: c  reason: collision with root package name */
        public long f34275c;

        /* renamed from: d  reason: collision with root package name */
        public long f34276d;

        /* renamed from: e  reason: collision with root package name */
        public long f34277e;

        /* renamed from: f  reason: collision with root package name */
        public int f34278f;

        /* renamed from: g  reason: collision with root package name */
        public int f34279g;

        /* renamed from: h  reason: collision with root package name */
        public int f34280h;

        /* renamed from: i  reason: collision with root package name */
        private int f34281i;

        static {
            Covode.recordClassIndex(20479);
        }

        public final int describeContents() {
            return 0;
        }

        public static final class a implements Parcelable.Creator<Tracker> {
            static {
                Covode.recordClassIndex(20480);
            }

            private a() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Tracker[] newArray(int i2) {
                return new Tracker[i2];
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Tracker createFromParcel(Parcel parcel) {
                l.c(parcel, "");
                return new Tracker(parcel);
            }
        }

        static final class b extends m implements h.f.a.a<Thread> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f34282a = new b();

            static {
                Covode.recordClassIndex(20481);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Thread invoke() {
                Looper mainLooper = Looper.getMainLooper();
                l.a((Object) mainLooper, "");
                return mainLooper.getThread();
            }
        }

        public Tracker() {
            this.f34273a = i.a((h.f.a.a) b.f34282a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Tracker(Parcel parcel) {
            this();
            l.c(parcel, "");
            this.f34274b = parcel.readLong();
            this.f34275c = parcel.readLong();
            this.f34276d = parcel.readLong();
            this.f34277e = parcel.readLong();
            this.f34278f = parcel.readInt();
            this.f34279g = parcel.readInt();
            this.f34280h = parcel.readInt();
            this.f34281i = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.c(parcel, "");
            parcel.writeLong(this.f34274b);
            parcel.writeLong(this.f34275c);
            parcel.writeLong(this.f34276d);
            parcel.writeLong(this.f34277e);
            parcel.writeInt(this.f34278f);
            parcel.writeInt(this.f34279g);
            parcel.writeInt(this.f34280h);
            parcel.writeInt(this.f34281i);
        }
    }

    private Dr() {
    }

    static {
        Covode.recordClassIndex(20478);
    }
}
