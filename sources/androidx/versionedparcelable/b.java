package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private final SparseIntArray f4421d;

    /* renamed from: e  reason: collision with root package name */
    private final Parcel f4422e;

    /* renamed from: f  reason: collision with root package name */
    private final int f4423f;

    /* renamed from: g  reason: collision with root package name */
    private final int f4424g;

    /* renamed from: h  reason: collision with root package name */
    private final String f4425h;

    /* renamed from: i  reason: collision with root package name */
    private int f4426i;

    /* renamed from: j  reason: collision with root package name */
    private int f4427j;

    /* renamed from: k  reason: collision with root package name */
    private int f4428k;

    static {
        Covode.recordClassIndex(1712);
    }

    @Override // androidx.versionedparcelable.a
    public final int c() {
        return this.f4422e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public final String d() {
        return this.f4422e.readString();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public final CharSequence f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4422e);
    }

    @Override // androidx.versionedparcelable.a
    public final <T extends Parcelable> T g() {
        return (T) this.f4422e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public final boolean h() {
        if (this.f4422e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.a
    public final byte[] e() {
        int readInt = this.f4422e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4422e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public final void a() {
        int i2 = this.f4426i;
        if (i2 >= 0) {
            int i3 = this.f4421d.get(i2);
            int dataPosition = this.f4422e.dataPosition();
            this.f4422e.setDataPosition(i3);
            this.f4422e.writeInt(dataPosition - i3);
            this.f4422e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public final a b() {
        Parcel parcel = this.f4422e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f4427j;
        if (i2 == this.f4423f) {
            i2 = this.f4424g;
        }
        return new b(parcel, dataPosition, i2, this.f4425h + "  ", this.f4418a, this.f4419b, this.f4420c);
    }

    @Override // androidx.versionedparcelable.a
    public final void a(int i2) {
        this.f4422e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.a
    public final void a(Parcelable parcelable) {
        this.f4422e.writeParcelable(parcelable, 0);
    }

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.a
    public final void a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4422e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public final void c(int i2) {
        a();
        this.f4426i = i2;
        this.f4421d.put(i2, this.f4422e.dataPosition());
        a(0);
        a(i2);
    }

    @Override // androidx.versionedparcelable.a
    public final void a(String str) {
        this.f4422e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public final boolean b(int i2) {
        while (this.f4427j < this.f4424g) {
            int i3 = this.f4428k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f4422e.setDataPosition(this.f4427j);
            int readInt = this.f4422e.readInt();
            this.f4428k = this.f4422e.readInt();
            this.f4427j += readInt;
        }
        if (this.f4428k == i2) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.a
    public final void a(boolean z) {
        this.f4422e.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.f4422e.writeInt(bArr.length);
            this.f4422e.writeByteArray(bArr);
            return;
        }
        this.f4422e.writeInt(-1);
    }

    private b(Parcel parcel, int i2, int i3, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4421d = new SparseIntArray();
        this.f4426i = -1;
        this.f4427j = 0;
        this.f4428k = -1;
        this.f4422e = parcel;
        this.f4423f = i2;
        this.f4424g = i3;
        this.f4427j = i2;
        this.f4425h = str;
    }
}
