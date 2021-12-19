package com.ss.android.ugc.aweme.tools.extract.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.extract.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static final C3695a n = new C3695a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f140028a;

    /* renamed from: b  reason: collision with root package name */
    public final b f140029b;

    /* renamed from: c  reason: collision with root package name */
    public final b f140030c;

    /* renamed from: d  reason: collision with root package name */
    public final b f140031d;

    /* renamed from: e  reason: collision with root package name */
    public final b f140032e;

    /* renamed from: f  reason: collision with root package name */
    public final b f140033f;

    /* renamed from: g  reason: collision with root package name */
    public final b f140034g;

    /* renamed from: h  reason: collision with root package name */
    public final b f140035h;

    /* renamed from: i  reason: collision with root package name */
    public final b f140036i;

    /* renamed from: j  reason: collision with root package name */
    public final b f140037j;

    /* renamed from: k  reason: collision with root package name */
    public final b f140038k;

    /* renamed from: l  reason: collision with root package name */
    public final b f140039l;

    /* renamed from: m  reason: collision with root package name */
    public final b f140040m;

    static {
        Covode.recordClassIndex(91514);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.b.a$a  reason: collision with other inner class name */
    public static final class C3695a {
        static {
            Covode.recordClassIndex(91515);
        }

        private C3695a() {
        }

        public /* synthetic */ C3695a(byte b2) {
            this();
        }

        public static a a(j jVar) {
            String str;
            String str2;
            String str3;
            String str4;
            l.d(jVar, "");
            a aVar = new a();
            aVar.f140030c.f140041a = jVar.f140090a;
            aVar.f140031d.f140041a = String.valueOf(jVar.f140091b);
            b bVar = aVar.f140032e;
            Boolean bool = jVar.f140093d;
            String str5 = null;
            if (bool != null) {
                str = String.valueOf(bool.booleanValue());
            } else {
                str = null;
            }
            bVar.f140041a = str;
            b bVar2 = aVar.f140033f;
            Integer num = jVar.f140092c;
            if (num != null) {
                str2 = String.valueOf(num.intValue());
            } else {
                str2 = null;
            }
            bVar2.f140041a = str2;
            b bVar3 = aVar.f140034g;
            Boolean bool2 = jVar.f140094e;
            if (bool2 != null) {
                str3 = String.valueOf(bool2.booleanValue());
            } else {
                str3 = null;
            }
            bVar3.f140041a = str3;
            b bVar4 = aVar.f140035h;
            Integer num2 = jVar.f140095f;
            if (num2 != null) {
                str4 = String.valueOf(num2.intValue());
            } else {
                str4 = null;
            }
            bVar4.f140041a = str4;
            b bVar5 = aVar.f140036i;
            Boolean bool3 = jVar.f140097h;
            if (bool3 != null) {
                str5 = String.valueOf(bool3.booleanValue());
            }
            bVar5.f140041a = str5;
            aVar.f140037j.f140041a = String.valueOf(jVar.f140098i);
            aVar.f140038k.f140041a = jVar.f140099j;
            return aVar;
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        this.f140028a = arrayList;
        b bVar = new b("ToolsMonitorType", true);
        arrayList.add(bVar);
        this.f140029b = bVar;
        b bVar2 = new b("ToolsAwemeId", true);
        arrayList.add(bVar2);
        this.f140030c = bVar2;
        b bVar3 = new b("ToolsMatchFactors", true);
        arrayList.add(bVar3);
        this.f140031d = bVar3;
        b bVar4 = new b("ToolsIsDraft", false);
        arrayList.add(bVar4);
        this.f140032e = bVar4;
        b bVar5 = new b("ToolsOrigin", false);
        arrayList.add(bVar5);
        this.f140033f = bVar5;
        b bVar6 = new b("ToolsIsBackUp", false);
        arrayList.add(bVar6);
        this.f140034g = bVar6;
        b bVar7 = new b("ToolsErrCode", true);
        arrayList.add(bVar7);
        this.f140035h = bVar7;
        b bVar8 = new b("ToolsIsRetry", false);
        arrayList.add(bVar8);
        this.f140036i = bVar8;
        b bVar9 = new b("ToolsUploadErrCode", true);
        arrayList.add(bVar9);
        this.f140037j = bVar9;
        b bVar10 = new b("ToolsDescription", false);
        arrayList.add(bVar10);
        this.f140038k = bVar10;
        b bVar11 = new b("ToolsMissingCound", true);
        arrayList.add(bVar11);
        this.f140039l = bVar11;
        b bVar12 = new b("ToolsMissingRate", false);
        arrayList.add(bVar12);
        this.f140040m = bVar12;
    }
}
