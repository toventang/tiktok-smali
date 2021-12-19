package com.ss.android.ugc.aweme.im.sdk.chat.data.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ai f100292a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<ag>> f100293b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<ag>> f100294c;

    static {
        Covode.recordClassIndex(63941);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f100292a, mVar.f100292a) && l.a(this.f100293b, mVar.f100293b) && l.a(this.f100294c, mVar.f100294c);
    }

    public final int hashCode() {
        ai aiVar = this.f100292a;
        int i2 = 0;
        int hashCode = (aiVar != null ? aiVar.hashCode() : 0) * 31;
        Map<String, List<ag>> map = this.f100293b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, List<ag>> map2 = this.f100294c;
        if (map2 != null) {
            i2 = map2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "OnGetModifyPropertyMsgEvent(msg=" + this.f100292a + ", oldMessageProperties=" + this.f100293b + ", newMessageProperties=" + this.f100294c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.im.core.d.ag>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.bytedance.im.core.d.ag>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(ai aiVar, Map<String, ? extends List<? extends ag>> map, Map<String, ? extends List<? extends ag>> map2) {
        super((byte) 0);
        l.d(aiVar, "");
        l.d(map, "");
        l.d(map2, "");
        this.f100292a = aiVar;
        this.f100293b = map;
        this.f100294c = map2;
    }
}
