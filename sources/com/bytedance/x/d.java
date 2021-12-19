package com.bytedance.x;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.l.h;
import h.l.k;
import h.m.p;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final XPath f46158a;

    /* renamed from: b  reason: collision with root package name */
    private int f46159b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.x.b.f f46160c;

    /* renamed from: d  reason: collision with root package name */
    private final b f46161d;

    /* renamed from: e  reason: collision with root package name */
    private final c f46162e;

    static {
        Covode.recordClassIndex(28220);
    }

    public d(com.bytedance.x.b.f fVar) {
        this(fVar, (b) null, 6);
    }

    public d(com.bytedance.x.b.f fVar, b bVar) {
        this(fVar, bVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.x.d$d  reason: collision with other inner class name */
    public static final /* synthetic */ class C1150d extends j implements h.f.a.b<Node, com.bytedance.x.b.g> {
        static {
            Covode.recordClassIndex(28224);
        }

        C1150d(d dVar) {
            super(1, dVar, d.class, "parseVideoClick", "parseVideoClick(Lorg/w3c/dom/Node;)Lcom/bytedance/vast/model/VideoClick;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.x.b.g invoke(Node node) {
            Node node2 = node;
            l.d(node2, "");
            return ((d) this.receiver).a(node2);
        }
    }

    private final void b(Node node) {
        c(node);
        d(node);
        e(node);
        f(node);
    }

    private final void c(Node node) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        h<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Error");
        XPath xPath2 = this.f46158a;
        l.b(xPath2, "");
        Iterator<String> a3 = com.bytedance.x.c.b.a(a2, xPath2).a();
        while (a3.hasNext()) {
            String next = a3.next();
            com.bytedance.x.b.f fVar = this.f46160c;
            fVar.errorSet = com.bytedance.x.c.a.a(fVar.errorSet, next);
        }
    }

    private final void d(Node node) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        h<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Impression");
        XPath xPath2 = this.f46158a;
        l.b(xPath2, "");
        Iterator<String> a3 = com.bytedance.x.c.b.a(a2, xPath2).a();
        while (a3.hasNext()) {
            String next = a3.next();
            com.bytedance.x.b.f fVar = this.f46160c;
            fVar.impressionSet = com.bytedance.x.c.a.a(fVar.impressionSet, next);
        }
    }

    private final void e(Node node) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./AdVerifications/Verification", "./Extension[@type='AdVerifications']/AdVerifications/Verification", "./Extensions/Extension[@type='AdVerifications']/AdVerifications/Verification").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            com.bytedance.x.b.a aVar = new com.bytedance.x.b.a();
            String evaluate = this.f46158a.evaluate("./@vendor", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.vender = p.b((CharSequence) evaluate).toString();
            String evaluate2 = this.f46158a.evaluate("./JavaScriptResource/text()", next);
            l.b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.javascriptResource = p.b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f46158a.evaluate("./VerificationParameters/text()", next);
            l.b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            aVar.verificationParameters = p.b((CharSequence) evaluate3).toString();
            com.bytedance.x.b.f fVar = this.f46160c;
            fVar.adVerificationList = com.bytedance.x.c.a.a(fVar.adVerificationList, aVar);
        }
    }

    private final void f(Node node) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./ViewableImpression").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            XPath xPath2 = this.f46158a;
            l.b(xPath2, "");
            h<Node> a3 = com.bytedance.x.c.b.a(xPath2, next, "./Viewable");
            XPath xPath3 = this.f46158a;
            l.b(xPath3, "");
            Iterator<String> a4 = com.bytedance.x.c.b.a(a3, xPath3).a();
            while (a4.hasNext()) {
                String next2 = a4.next();
                com.bytedance.x.b.f fVar = this.f46160c;
                fVar.viewableSet = com.bytedance.x.c.a.a(fVar.viewableSet, next2);
            }
            XPath xPath4 = this.f46158a;
            l.b(xPath4, "");
            h<Node> a5 = com.bytedance.x.c.b.a(xPath4, next, "./NotViewable");
            XPath xPath5 = this.f46158a;
            l.b(xPath5, "");
            Iterator<String> a6 = com.bytedance.x.c.b.a(a5, xPath5).a();
            while (a6.hasNext()) {
                String next3 = a6.next();
                com.bytedance.x.b.f fVar2 = this.f46160c;
                fVar2.notViewableSet = com.bytedance.x.c.a.a(fVar2.notViewableSet, next3);
            }
            XPath xPath6 = this.f46158a;
            l.b(xPath6, "");
            h<Node> a7 = com.bytedance.x.c.b.a(xPath6, next, "./ViewUndetermined");
            XPath xPath7 = this.f46158a;
            l.b(xPath7, "");
            Iterator<String> a8 = com.bytedance.x.c.b.a(a7, xPath7).a();
            while (a8.hasNext()) {
                String next4 = a8.next();
                com.bytedance.x.b.f fVar3 = this.f46160c;
                fVar3.viewUndeterminedSet = com.bytedance.x.c.a.a(fVar3.viewUndeterminedSet, next4);
            }
        }
    }

    public final com.bytedance.x.b.g a(Node node) {
        com.bytedance.x.b.g gVar = new com.bytedance.x.b.g();
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        h a2 = k.a("./ClickThrough", "./IconClickThrough");
        l.d(xPath, "");
        l.d(node, "");
        l.d(a2, "");
        gVar.clickThrough = (String) k.d(com.bytedance.x.c.b.a(com.bytedance.x.c.b.a(xPath, node, a2), xPath));
        XPath xPath2 = this.f46158a;
        l.b(xPath2, "");
        h<Node> a3 = com.bytedance.x.c.b.a(xPath2, node, k.a("./ClickTracking", "./IconClickTracking"));
        XPath xPath3 = this.f46158a;
        l.b(xPath3, "");
        Iterator<String> a4 = com.bytedance.x.c.b.a(a3, xPath3).a();
        while (a4.hasNext()) {
            gVar.clickTracking = com.bytedance.x.c.a.a(gVar.clickTracking, a4.next());
        }
        return gVar;
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(28221);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(28222);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    public static final class c<T> implements Comparator {
        static {
            Covode.recordClassIndex(28223);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    public static final class e<T> implements Comparator {
        static {
            Covode.recordClassIndex(28225);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    public static final class f<T> implements Comparator {
        static {
            Covode.recordClassIndex(28226);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    public static final class g<T> implements Comparator {
        static {
            Covode.recordClassIndex(28227);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.byWrapper ? 1 : 0), Integer.valueOf(t2.byWrapper ? 1 : 0));
        }
    }

    private final void b(Node node, com.bytedance.x.b.b bVar) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator a2 = k.e(com.bytedance.x.c.b.a(xPath, node, "./Linear/VideoClicks"), new C1150d(this)).a();
        while (a2.hasNext()) {
            bVar.clickList = com.bytedance.x.c.a.a(bVar.clickList, a2.next());
        }
    }

    private final void a(Node node, com.bytedance.x.b.b bVar) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Linear/TrackingEvents/Tracking").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            com.bytedance.x.b.e eVar = new com.bytedance.x.b.e();
            String evaluate = this.f46158a.evaluate("./@event", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.name = p.b((CharSequence) evaluate).toString();
            String evaluate2 = this.f46158a.evaluate("./@offset", next);
            l.b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.offset = p.b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f46158a.evaluate("./text()", next);
            l.b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            eVar.url = p.b((CharSequence) evaluate3).toString();
            bVar.trackingEventList = com.bytedance.x.c.a.a(bVar.trackingEventList, eVar);
        }
    }

    private final void a(Node node, boolean z) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Creatives/Creative").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            com.bytedance.x.b.b bVar = new com.bytedance.x.b.b();
            bVar.byWrapper = z;
            String evaluate = this.f46158a.evaluate("./@id", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            bVar.id = p.b((CharSequence) evaluate).toString();
            XPath xPath2 = this.f46158a;
            l.b(xPath2, "");
            l.d(xPath2, "");
            l.d(next, "");
            l.d("./Linear/Duration", "");
            bVar.duration = (String) k.d(com.bytedance.x.c.b.a(com.bytedance.x.c.b.a(xPath2, next, "./Linear/Duration"), xPath2));
            a(next, bVar);
            b(next, bVar);
            c(next, bVar);
            d(next, bVar);
            if (z) {
                com.bytedance.x.b.f fVar = this.f46160c;
                List<com.bytedance.x.b.b> list = fVar.creativeList;
                if (list == null) {
                    list = new LinkedList<>();
                }
                list.add(0, bVar);
                fVar.creativeList = list;
            } else {
                com.bytedance.x.b.f fVar2 = this.f46160c;
                fVar2.creativeList = com.bytedance.x.c.a.a(fVar2.creativeList, bVar);
            }
        }
    }

    public final boolean b(String str, int i2) {
        List<com.bytedance.x.b.b> list;
        List<com.bytedance.x.b.b> list2;
        List<com.bytedance.x.b.b> list3;
        c cVar = this.f46162e;
        if (cVar != null) {
            cVar.b();
        }
        this.f46159b++;
        Document document = null;
        if (str != null) {
            try {
                document = com.bytedance.x.c.b.b(str);
            } catch (com.bytedance.x.a.b e2) {
                c cVar2 = this.f46162e;
                if (cVar2 != null) {
                    cVar2.a(e2);
                }
            } catch (Throwable th) {
                c cVar3 = this.f46162e;
                if (cVar3 != null) {
                    cVar3.e();
                }
                int i3 = this.f46159b - 1;
                this.f46159b = i3;
                if (i3 == 0 && (list3 = this.f46160c.creativeList) != null && list3.size() > 1) {
                    n.a((List) list3, (Comparator) new c());
                }
                throw th;
            }
        }
        if (document == null) {
            c cVar4 = this.f46162e;
            if (cVar4 != null) {
                cVar4.e();
            }
            int i4 = this.f46159b - 1;
            this.f46159b = i4;
            if (i4 == 0 && (list2 = this.f46160c.creativeList) != null && list2.size() > 1) {
                n.a((List) list2, (Comparator) new a());
            }
            return false;
        }
        boolean a2 = a(document, i2, 0);
        c cVar5 = this.f46162e;
        if (cVar5 != null) {
            cVar5.e();
        }
        int i5 = this.f46159b - 1;
        this.f46159b = i5;
        if (i5 == 0 && (list = this.f46160c.creativeList) != null && list.size() > 1) {
            n.a((List) list, (Comparator) new b());
        }
        return a2;
    }

    private final void c(Node node, com.bytedance.x.b.b bVar) {
        boolean z;
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Linear/MediaFiles/MediaFile").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            com.bytedance.x.b.d dVar = new com.bytedance.x.b.d();
            String evaluate = this.f46158a.evaluate("./@delivery", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.delivery = p.b((CharSequence) evaluate).toString();
            String evaluate2 = this.f46158a.evaluate("./@type", next);
            l.b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.type = p.b((CharSequence) evaluate2).toString();
            String evaluate3 = this.f46158a.evaluate("./text()", next);
            l.b(evaluate3, "");
            Objects.requireNonNull(evaluate3, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.url = p.b((CharSequence) evaluate3).toString();
            XPath xPath2 = this.f46158a;
            l.b(xPath2, "");
            String evaluate4 = xPath2.evaluate("./@bitrate", next);
            l.b(evaluate4, "");
            Objects.requireNonNull(evaluate4, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e2 = p.e(p.b((CharSequence) evaluate4).toString());
            if (e2 != null) {
                dVar.bitRate = e2.intValue();
            }
            XPath xPath3 = this.f46158a;
            l.b(xPath3, "");
            String evaluate5 = xPath3.evaluate("./@width", next);
            l.b(evaluate5, "");
            Objects.requireNonNull(evaluate5, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e3 = p.e(p.b((CharSequence) evaluate5).toString());
            if (e3 != null) {
                dVar.width = e3.intValue();
            }
            XPath xPath4 = this.f46158a;
            l.b(xPath4, "");
            String evaluate6 = xPath4.evaluate("./@height", next);
            l.b(evaluate6, "");
            Objects.requireNonNull(evaluate6, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e4 = p.e(p.b((CharSequence) evaluate6).toString());
            if (e4 != null) {
                dVar.height = e4.intValue();
            }
            XPath xPath5 = this.f46158a;
            l.b(xPath5, "");
            String evaluate7 = xPath5.evaluate("./@scalable", next);
            l.b(evaluate7, "");
            Objects.requireNonNull(evaluate7, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = p.b((CharSequence) evaluate7).toString();
            if (obj.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                dVar.scalable = Boolean.valueOf(p.a("true", obj, true));
            }
            XPath xPath6 = this.f46158a;
            l.b(xPath6, "");
            String evaluate8 = xPath6.evaluate("./@maintainAspectRatio", next);
            l.b(evaluate8, "");
            Objects.requireNonNull(evaluate8, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = p.b((CharSequence) evaluate8).toString();
            if (obj2.length() > 0) {
                dVar.maintainAspectRatio = Boolean.valueOf(p.a("true", obj2, true));
            }
            bVar.mediaFileList = com.bytedance.x.c.a.a(bVar.mediaFileList, dVar);
        }
    }

    private final void d(Node node, com.bytedance.x.b.b bVar) {
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./Linear/Icons/Icon").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            com.bytedance.x.b.c cVar = new com.bytedance.x.b.c();
            XPath xPath2 = this.f46158a;
            l.b(xPath2, "");
            String evaluate = xPath2.evaluate("./@width", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e2 = p.e(p.b((CharSequence) evaluate).toString());
            if (e2 != null) {
                cVar.width = e2.intValue();
            }
            XPath xPath3 = this.f46158a;
            l.b(xPath3, "");
            String evaluate2 = xPath3.evaluate("./@height", next);
            l.b(evaluate2, "");
            Objects.requireNonNull(evaluate2, "null cannot be cast to non-null type kotlin.CharSequence");
            Integer e3 = p.e(p.b((CharSequence) evaluate2).toString());
            if (e3 != null) {
                cVar.width = e3.intValue();
            }
            cVar.program = this.f46158a.evaluate("./@program", next);
            XPath xPath4 = this.f46158a;
            l.b(xPath4, "");
            h<Node> a3 = com.bytedance.x.c.b.a(xPath4, next, "./StaticResource");
            XPath xPath5 = this.f46158a;
            l.b(xPath5, "");
            cVar.staticResource = k.f(com.bytedance.x.c.b.a(a3, xPath5));
            XPath xPath6 = this.f46158a;
            l.b(xPath6, "");
            h<Node> a4 = com.bytedance.x.c.b.a(xPath6, next, "./HTMLResource");
            XPath xPath7 = this.f46158a;
            l.b(xPath7, "");
            cVar.htmlResource = (String) k.d(com.bytedance.x.c.b.a(a4, xPath7));
            XPath xPath8 = this.f46158a;
            l.b(xPath8, "");
            h<Node> a5 = com.bytedance.x.c.b.a(xPath8, next, "./IFrameResource");
            XPath xPath9 = this.f46158a;
            l.b(xPath9, "");
            cVar.iFrameResource = (String) k.d(com.bytedance.x.c.b.a(a5, xPath9));
            XPath xPath10 = this.f46158a;
            l.b(xPath10, "");
            h<Node> a6 = com.bytedance.x.c.b.a(xPath10, next, "./IconViewTracking");
            XPath xPath11 = this.f46158a;
            l.b(xPath11, "");
            cVar.viewTracking = k.f(com.bytedance.x.c.b.a(a6, xPath11));
            XPath xPath12 = this.f46158a;
            l.b(xPath12, "");
            Iterator<Node> a7 = com.bytedance.x.c.b.a(xPath12, next, "./IconClicks").a();
            while (a7.hasNext()) {
                cVar.clickList = com.bytedance.x.c.a.a(cVar.clickList, a(a7.next()));
            }
            bVar.iconList = com.bytedance.x.c.a.a(bVar.iconList, cVar);
        }
    }

    public final boolean a(String str, int i2) {
        List<com.bytedance.x.b.b> list;
        List<com.bytedance.x.b.b> list2;
        List<com.bytedance.x.b.b> list3;
        c cVar = this.f46162e;
        if (cVar != null) {
            cVar.a();
        }
        this.f46159b++;
        Document document = null;
        try {
            b bVar = this.f46161d;
            if (bVar == null) {
                bVar = a.f46153a;
            }
            document = bVar.a(str);
        } catch (com.bytedance.x.a.a e2) {
            c cVar2 = this.f46162e;
            if (cVar2 != null) {
                cVar2.a(e2);
            }
        } catch (com.bytedance.x.a.b e3) {
            c cVar3 = this.f46162e;
            if (cVar3 != null) {
                cVar3.a(e3);
            }
        } catch (Throwable th) {
            c cVar4 = this.f46162e;
            if (cVar4 != null) {
                cVar4.e();
            }
            int i3 = this.f46159b - 1;
            this.f46159b = i3;
            if (i3 == 0 && (list = this.f46160c.creativeList) != null && list.size() > 1) {
                n.a((List) list, (Comparator) new g());
            }
            throw th;
        }
        if (document == null) {
            c cVar5 = this.f46162e;
            if (cVar5 != null) {
                cVar5.e();
            }
            int i4 = this.f46159b - 1;
            this.f46159b = i4;
            if (i4 == 0 && (list3 = this.f46160c.creativeList) != null && list3.size() > 1) {
                n.a((List) list3, (Comparator) new e());
            }
            return false;
        }
        boolean a2 = a(document, i2, 0);
        c cVar6 = this.f46162e;
        if (cVar6 != null) {
            cVar6.e();
        }
        int i5 = this.f46159b - 1;
        this.f46159b = i5;
        if (i5 == 0 && (list2 = this.f46160c.creativeList) != null && list2.size() > 1) {
            n.a((List) list2, (Comparator) new f());
        }
        return a2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ d(com.bytedance.x.b.f fVar, b bVar, int i2) {
        this(fVar, (i2 & 2) != 0 ? null : bVar, (c) null);
    }

    public d(com.bytedance.x.b.f fVar, b bVar, c cVar) {
        l.d(fVar, "");
        this.f46160c = fVar;
        this.f46161d = bVar;
        this.f46162e = cVar;
        this.f46158a = XPathFactory.newInstance().newXPath();
    }

    private final boolean a(Document document, int i2, int i3) {
        int i4 = i2 - 1;
        String str = this.f46160c.version;
        if (str == null || str.length() == 0) {
            this.f46160c.version = this.f46158a.evaluate("/VAST/@version", document);
        }
        XPath xPath = this.f46158a;
        l.b(xPath, "");
        Iterator<Node> a2 = com.bytedance.x.c.b.a(xPath, document, "/VAST/Ad/InLine").a();
        while (a2.hasNext()) {
            Node next = a2.next();
            c cVar = this.f46162e;
            if (cVar != null) {
                cVar.c();
            }
            String str2 = this.f46160c.adSystem;
            if (str2 == null || str2.length() == 0) {
                com.bytedance.x.b.f fVar = this.f46160c;
                XPath xPath2 = this.f46158a;
                l.b(xPath2, "");
                h<Node> a3 = com.bytedance.x.c.b.a(xPath2, next, "./AdSystem");
                XPath xPath3 = this.f46158a;
                l.b(xPath3, "");
                fVar.adSystem = (String) k.d(com.bytedance.x.c.b.a(a3, xPath3));
            }
            String str3 = this.f46160c.adTitle;
            if (str3 == null || str3.length() == 0) {
                com.bytedance.x.b.f fVar2 = this.f46160c;
                XPath xPath4 = this.f46158a;
                l.b(xPath4, "");
                h<Node> a4 = com.bytedance.x.c.b.a(xPath4, next, "./AdTitle");
                XPath xPath5 = this.f46158a;
                l.b(xPath5, "");
                fVar2.adTitle = (String) k.d(com.bytedance.x.c.b.a(a4, xPath5));
            }
            String evaluate = this.f46158a.evaluate("./Description/text()", next);
            l.b(evaluate, "");
            Objects.requireNonNull(evaluate, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = p.b((CharSequence) evaluate).toString();
            if (obj.length() > 0) {
                this.f46160c.description = obj;
            }
            a(next, false);
            b(next);
        }
        XPath xPath6 = this.f46158a;
        l.b(xPath6, "");
        Iterator<Node> a5 = com.bytedance.x.c.b.a(xPath6, document, "/VAST/Ad/Wrapper").a();
        while (a5.hasNext()) {
            Node next2 = a5.next();
            a(next2, true);
            b(next2);
            if (!a(next2, i4, i3)) {
                return false;
            }
        }
        return true;
    }

    private final boolean a(Node node, int i2, int i3) {
        c cVar;
        if (i2 < 0) {
            c cVar2 = this.f46162e;
            if (cVar2 != null) {
                XPath xPath = this.f46158a;
                l.b(xPath, "");
                h<Node> a2 = com.bytedance.x.c.b.a(xPath, node, "./VASTAdTagURI");
                XPath xPath2 = this.f46158a;
                l.b(xPath2, "");
                Iterator<String> a3 = com.bytedance.x.c.b.a(a2, xPath2).a();
                while (a3.hasNext()) {
                    a3.next();
                    cVar2.d();
                }
            }
            return false;
        }
        XPath xPath3 = this.f46158a;
        l.b(xPath3, "");
        h<Node> a4 = com.bytedance.x.c.b.a(xPath3, node, "./VASTAdTagURI");
        XPath xPath4 = this.f46158a;
        l.b(xPath4, "");
        Iterator<String> a5 = com.bytedance.x.c.b.a(a4, xPath4).a();
        boolean z = false;
        while (a5.hasNext()) {
            String next = a5.next();
            c cVar3 = this.f46162e;
            if (cVar3 != null) {
                cVar3.a();
            }
            try {
                b bVar = this.f46161d;
                if (bVar == null) {
                    bVar = a.f46153a;
                }
                Document a6 = bVar.a(next);
                if (a6 == null) {
                    c cVar4 = this.f46162e;
                    if (cVar4 != null) {
                        cVar4.e();
                    }
                    return false;
                } else if (!a(a6, i2, i3 + 1)) {
                    c cVar5 = this.f46162e;
                    if (cVar5 != null) {
                        cVar5.e();
                    }
                    return false;
                } else {
                    c cVar6 = this.f46162e;
                    if (cVar6 != null) {
                        cVar6.e();
                    }
                    z = true;
                }
            } catch (com.bytedance.x.a.a e2) {
                c cVar7 = this.f46162e;
                if (cVar7 != null) {
                    cVar7.a(e2);
                }
            } catch (com.bytedance.x.a.b e3) {
                c cVar8 = this.f46162e;
                if (cVar8 != null) {
                    cVar8.a(e3);
                }
            } catch (Throwable th) {
                c cVar9 = this.f46162e;
                if (cVar9 != null) {
                    cVar9.e();
                }
                throw th;
            }
        }
        if (!z && (cVar = this.f46162e) != null) {
            cVar.a(new com.bytedance.x.a.b("VASTAdTagURI missing"));
        }
        return z;
    }
}
