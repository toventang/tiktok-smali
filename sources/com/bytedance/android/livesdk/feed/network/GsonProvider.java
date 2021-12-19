package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.live.e;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.feed.services.FeedItemDeserializer;
import com.bytedance.android.livesdk.feed.services.b;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.v;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class GsonProvider implements b.AbstractC0369b<f> {
    static {
        Covode.recordClassIndex(9743);
    }

    static class a extends v<Boolean> {
        static {
            Covode.recordClassIndex(9751);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.v
        public final /* synthetic */ Boolean read(com.google.gson.c.a aVar) {
            com.google.gson.c.b f2 = aVar.f();
            int i2 = AnonymousClass1.f17591a[f2.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                return Boolean.valueOf(aVar.j());
            }
            if (i2 == 2) {
                aVar.k();
                return null;
            } else if (i2 == 3) {
                if (aVar.n() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } else {
                throw new p("Expected BOOLEAN or NUMBER but was ".concat(String.valueOf(f2)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
        @Override // com.google.gson.v
        public final /* synthetic */ void write(c cVar, Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                cVar.f();
            } else {
                cVar.a(bool2);
            }
        }
    }

    static class RoomDeserializer implements k<Room> {

        /* renamed from: a  reason: collision with root package name */
        private f f17593a;

        static {
            Covode.recordClassIndex(9750);
        }

        private RoomDeserializer() {
            this.f17593a = e.a.f9628b;
        }

        /* synthetic */ RoomDeserializer(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.gson.k
        public final /* synthetic */ Room a(l lVar, Type type, j jVar) {
            Room room = (Room) this.f17593a.a(lVar, type);
            room.init();
            return room;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.network.GsonProvider$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17591a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 9744(0x2610, float:1.3654E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.google.gson.c.b[] r0 = com.google.gson.c.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.feed.network.GsonProvider.AnonymousClass1.f17591a = r2
                com.google.gson.c.b r0 = com.google.gson.c.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.feed.network.GsonProvider.AnonymousClass1.f17591a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.google.gson.c.b r0 = com.google.gson.c.b.NULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.feed.network.GsonProvider.AnonymousClass1.f17591a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.google.gson.c.b r0 = com.google.gson.c.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.network.GsonProvider.AnonymousClass1.<clinit>():void");
        }
    }

    static class BaseListResponseDeserializer extends AbsJsonDeserializer<com.bytedance.android.live.network.response.a> {
        static {
            Covode.recordClassIndex(9746);
        }

        public BaseListResponseDeserializer(f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.k
        public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
            o j2 = lVar.j();
            int g2 = j2.c("status_code").g();
            if (g2 == 0) {
                return this.f17592a.a(lVar, type);
            }
            com.bytedance.android.live.network.response.a aVar = new com.bytedance.android.live.network.response.a();
            aVar.f12144a = g2;
            aVar.f12147d = (RequestError) this.f17592a.a(j2.c("data"), RequestError.class);
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                if (actualTypeArguments.length > 1) {
                    aVar.f12146c = (R) ((Extra) this.f17592a.a(j2.c("extra"), actualTypeArguments[1]));
                    return aVar;
                }
            }
            aVar.f12146c = (R) ((Extra) this.f17592a.a(j2.c("extra"), Extra.class));
            return aVar;
        }
    }

    static class BaseResponseDeserializer extends AbsJsonDeserializer<com.bytedance.android.live.network.response.b> {
        static {
            Covode.recordClassIndex(9747);
        }

        BaseResponseDeserializer(f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.k
        public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
            com.bytedance.android.live.network.response.b bVar = (com.bytedance.android.live.network.response.b) this.f17592a.a(lVar, type);
            if (bVar.statusCode != 0) {
                bVar.error = (RequestError) this.f17592a.a(lVar.j().c("data"), RequestError.class);
            }
            return bVar;
        }
    }

    static class ListResponseDeserializer extends AbsJsonDeserializer<com.bytedance.android.live.network.response.c> {
        static {
            Covode.recordClassIndex(9748);
        }

        public ListResponseDeserializer(f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.k
        public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
            o j2 = lVar.j();
            int g2 = j2.c("status_code").g();
            if (g2 == 0) {
                return this.f17592a.a(lVar, type);
            }
            com.bytedance.android.live.network.response.c cVar = new com.bytedance.android.live.network.response.c();
            cVar.f12144a = g2;
            cVar.f12146c = (Extra) this.f17592a.a(j2.c("extra"), Extra.class);
            cVar.f12147d = (RequestError) this.f17592a.a(j2.c("data"), RequestError.class);
            return cVar;
        }
    }

    static class ResponseDeserializer extends AbsJsonDeserializer<d> {
        static {
            Covode.recordClassIndex(9749);
        }

        ResponseDeserializer(f fVar) {
            super(fVar);
        }

        @Override // com.google.gson.k
        public final /* synthetic */ Object a(l lVar, Type type, j jVar) {
            d dVar = (d) this.f17592a.a(lVar, type);
            if (dVar.statusCode != 0) {
                dVar.error = (RequestError) this.f17592a.a(lVar.j().c("data"), RequestError.class);
            }
            return dVar;
        }
    }

    static abstract class AbsJsonDeserializer<T> implements k<T> {

        /* renamed from: a  reason: collision with root package name */
        protected f f17592a;

        static {
            Covode.recordClassIndex(9745);
        }

        public AbsJsonDeserializer(f fVar) {
            this.f17592a = fVar;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.services.b.AbstractC0369b
    public final b.AbstractC0369b.a<f> a(b.AbstractC0369b.a<f> aVar) {
        g gVar = new g();
        gVar.f54712b = com.google.gson.d.LOWER_CASE_WITH_UNDERSCORES;
        gVar.a((Type) Room.class, (Object) new RoomDeserializer((byte) 0));
        gVar.a((Type) FeedItem.class, (Object) new FeedItemDeserializer());
        gVar.a((Type) Boolean.class, (Object) new a((byte) 0));
        gVar.a((Type) Boolean.TYPE, (Object) new a((byte) 0));
        g gVar2 = new g();
        gVar2.f54712b = com.google.gson.d.LOWER_CASE_WITH_UNDERSCORES;
        gVar2.a((Type) Room.class, (Object) new RoomDeserializer((byte) 0));
        gVar2.a((Type) FeedItem.class, (Object) new FeedItemDeserializer());
        gVar2.a((Type) Boolean.class, (Object) new a((byte) 0));
        gVar2.a((Type) Boolean.TYPE, (Object) new a((byte) 0));
        f b2 = gVar2.b();
        gVar.a((Type) com.bytedance.android.live.network.response.b.class, (Object) new BaseResponseDeserializer(b2));
        gVar.a((Type) d.class, (Object) new ResponseDeserializer(b2));
        gVar.a((Type) com.bytedance.android.live.network.response.a.class, (Object) new BaseListResponseDeserializer(b2));
        gVar.a((Type) com.bytedance.android.live.network.response.c.class, (Object) new ListResponseDeserializer(b2));
        aVar.f17649a = (R) gVar.b();
        aVar.f17650b = true;
        return aVar;
    }
}
