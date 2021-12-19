package com.bytedance.x.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.h;
import h.l.k;
import h.m.p;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public final class b {
    static {
        Covode.recordClassIndex(28213);
    }

    static final class c extends m implements h.f.a.b<Node, String> {
        final /* synthetic */ XPath $xpath;

        static {
            Covode.recordClassIndex(28216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(XPath xPath) {
            super(1);
            this.$xpath = xPath;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Node node) {
            l.d(node, "");
            return this.$xpath.evaluate("./text()", node);
        }
    }

    static final class a extends m implements h.f.a.b<String, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f46155a = new a();

        static {
            Covode.recordClassIndex(28214);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(String str) {
            String str2 = str;
            l.b(str2, "");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            return p.b((CharSequence) str2).toString();
        }
    }

    /* renamed from: com.bytedance.x.c.b$b  reason: collision with other inner class name */
    static final class C1149b extends m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1149b f46156a = new C1149b();

        static {
            Covode.recordClassIndex(28215);
        }

        C1149b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            l.b(str2, "");
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<String, h<? extends Node>> {
        final /* synthetic */ Object $item;
        final /* synthetic */ XPath $this_nodeList;

        static {
            Covode.recordClassIndex(28217);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(XPath xPath, Object obj) {
            super(1);
            this.$this_nodeList = xPath;
            this.$item = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h<? extends Node> invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            Object evaluate = this.$this_nodeList.evaluate(str2, this.$item, XPathConstants.NODESET);
            if (!(evaluate instanceof NodeList)) {
                evaluate = null;
            }
            final NodeList nodeList = (NodeList) evaluate;
            if (nodeList == null) {
                return h.l.c.f158758a;
            }
            return k.e(n.t(h.j.h.a(0, nodeList.getLength())), new h.f.a.b<Integer, Node>() {
                /* class com.bytedance.x.c.b.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28218);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ Node invoke(Integer num) {
                    return nodeList.item(num.intValue());
                }
            });
        }
    }

    public static final Document b(String str) {
        MethodCollector.i(11725);
        l.d(str, "");
        try {
            byte[] bytes = str.getBytes(h.m.d.f158808a);
            l.b(bytes, "");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(byteArrayInputStream);
                h.e.c.a(byteArrayInputStream, null);
                MethodCollector.o(11725);
                return parse;
            } catch (Throwable th) {
                h.e.c.a(byteArrayInputStream, th);
                MethodCollector.o(11725);
                throw th;
            }
        } catch (Throwable th2) {
            com.bytedance.x.a.b bVar = new com.bytedance.x.a.b(th2);
            MethodCollector.o(11725);
            throw bVar;
        }
    }

    public static final Document a(String str) {
        l.d(str, "");
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(str);
        } catch (SAXException e2) {
            throw new com.bytedance.x.a.b(e2);
        } catch (Throwable th) {
            throw new com.bytedance.x.a.a(str, th);
        }
    }

    public static final h<String> a(h<? extends Node> hVar, XPath xPath) {
        l.d(hVar, "");
        l.d(xPath, "");
        return k.a(k.e(k.e(hVar, new c(xPath)), a.f46155a), (h.f.a.b) C1149b.f46156a);
    }

    public static final h<Node> a(XPath xPath, Object obj, h<String> hVar) {
        l.d(xPath, "");
        l.d(obj, "");
        l.d(hVar, "");
        return k.d(hVar, new d(xPath, obj));
    }

    public static final h<Node> a(XPath xPath, Object obj, String... strArr) {
        l.d(xPath, "");
        l.d(obj, "");
        l.d(strArr, "");
        return a(xPath, obj, i.p(strArr));
    }
}
