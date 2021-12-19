package com.ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget;
import h.f.b.l;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f92239a;

    /* renamed from: b  reason: collision with root package name */
    public final String f92240b;

    /* renamed from: c  reason: collision with root package name */
    public final String f92241c;

    /* renamed from: d  reason: collision with root package name */
    public final String f92242d;

    /* renamed from: e  reason: collision with root package name */
    public final String f92243e;

    /* renamed from: f  reason: collision with root package name */
    public final String f92244f;

    /* renamed from: g  reason: collision with root package name */
    public final VideoDiggWidget.a f92245g;

    static {
        Covode.recordClassIndex(58237);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f92239a, jVar.f92239a) && l.a(this.f92240b, jVar.f92240b) && l.a(this.f92241c, jVar.f92241c) && l.a(this.f92242d, jVar.f92242d) && l.a(this.f92243e, jVar.f92243e) && l.a(this.f92244f, jVar.f92244f) && l.a(this.f92245g, jVar.f92245g);
    }

    public final int hashCode() {
        String str = this.f92239a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f92240b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f92241c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f92242d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f92243e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f92244f;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        VideoDiggWidget.a aVar = this.f92245g;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "VideoDiggHierarchyData(previousPage=" + this.f92239a + ", fromGroupId=" + this.f92240b + ", previousPagePosition=" + this.f92241c + ", creationId=" + this.f92242d + ", challengeId=" + this.f92243e + ", parentTagId=" + this.f92244f + ", infoProvider=" + this.f92245g + ")";
    }

    public /* synthetic */ j() {
        this(null, null, null, null, null, null, null);
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, VideoDiggWidget.a aVar) {
        this.f92239a = str;
        this.f92240b = str2;
        this.f92241c = str3;
        this.f92242d = str4;
        this.f92243e = str5;
        this.f92244f = str6;
        this.f92245g = aVar;
    }
}
