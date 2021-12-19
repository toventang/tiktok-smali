package com.ss.android.ugc.aweme.following.a;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import h.f.b.l;

public final class d extends j.e<Object> {
    static {
        Covode.recordClassIndex(60993);
    }

    @Override // androidx.recyclerview.widget.j.e
    public final boolean a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        if (!(obj instanceof f) || !(obj2 instanceof f)) {
            if ((obj instanceof g) && (obj2 instanceof g)) {
                g gVar = (g) obj;
                g gVar2 = (g) obj2;
                if (gVar.f96342a != gVar2.f96342a || !l.a((Object) gVar.f96343b.getUid(), (Object) gVar2.f96343b.getUid())) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof e) || !(obj2 instanceof e)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return l.a(((RecommendContact) obj).getType(), ((RecommendContact) obj2).getType());
            } else if (((e) obj).f96337a == ((e) obj2).f96337a) {
                return true;
            } else {
                return false;
            }
        } else if (((f) obj).f96340a == ((f) obj2).f96340a) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.j.e
    public final boolean b(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        if (!(obj instanceof f) || !(obj2 instanceof f)) {
            if ((obj instanceof g) && (obj2 instanceof g)) {
                g gVar = (g) obj;
                g gVar2 = (g) obj2;
                if (gVar.f96342a != gVar2.f96342a || !l.a(gVar.f96343b, gVar2.f96343b)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof e) || !(obj2 instanceof e)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return l.a(((RecommendContact) obj).getType(), ((RecommendContact) obj2).getType());
            } else if (((e) obj).f96337a == ((e) obj2).f96337a) {
                return true;
            } else {
                return false;
            }
        } else if (((f) obj).f96340a == ((f) obj2).f96340a) {
            return true;
        } else {
            return false;
        }
    }
}
