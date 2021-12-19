package com.ss.android.ugc.aweme.video.hashtag;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Comparator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f143394a;

    /* renamed from: b  reason: collision with root package name */
    public int f143395b;

    /* renamed from: c  reason: collision with root package name */
    public String f143396c;

    static {
        Covode.recordClassIndex(93843);
    }

    public a() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f143394a), Integer.valueOf(this.f143395b), this.f143396c});
    }

    public final String toString() {
        return "(" + this.f143396c + ": " + this.f143394a + ", " + this.f143395b + ")";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f143394a == aVar.f143394a && this.f143395b == aVar.f143395b && ((str = this.f143396c) == (str2 = aVar.f143396c) || (str != null && str.equals(str2)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.a$a  reason: collision with other inner class name */
    public static class C3821a implements Comparator<a> {
        static {
            Covode.recordClassIndex(93844);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3.f143394a == aVar4.f143394a) {
                return 0;
            }
            if (aVar3.f143394a < aVar4.f143394a) {
                return -1;
            }
            return 1;
        }
    }

    public a(String str, int i2, int i3) {
        this.f143396c = str;
        this.f143394a = i2;
        this.f143395b = i3;
    }
}
