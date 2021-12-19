package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.ss.android.ugc.aweme.shortvideo.publish.b.a;
import com.ss.android.ugc.aweme.shortvideo.publish.q;
import com.ss.android.ugc.aweme.shortvideo.v.f;
import com.ss.android.ugc.aweme.shortvideo.v.h;
import com.ss.android.ugc.aweme.story.publish.j;
import com.ss.android.ugc.b;

public class PublishServiceFactoryImpl implements IPublishServiceFactory {
    static {
        Covode.recordClassIndex(81972);
    }

    public static IPublishServiceFactory a() {
        MethodCollector.i(10521);
        Object a2 = b.a(IPublishServiceFactory.class, false);
        if (a2 != null) {
            IPublishServiceFactory iPublishServiceFactory = (IPublishServiceFactory) a2;
            MethodCollector.o(10521);
            return iPublishServiceFactory;
        }
        if (b.eb == null) {
            synchronized (IPublishServiceFactory.class) {
                try {
                    if (b.eb == null) {
                        b.eb = new PublishServiceFactoryImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10521);
                    throw th;
                }
            }
        }
        PublishServiceFactoryImpl publishServiceFactoryImpl = (PublishServiceFactoryImpl) b.eb;
        MethodCollector.o(10521);
        return publishServiceFactoryImpl;
    }

    @Override // com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    public final j a(q qVar) {
        int i2 = qVar.f129879h;
        int i3 = qVar.f129878g;
        if (i2 == 0) {
            return new a(new TTUploaderService(), qVar.f129872a, qVar.f129874c, i2, i3, qVar.f129882k);
        }
        throw new AssertionError("videoType == ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    public final x<ai> a(int i2, Object obj) {
        if (i2 == 0) {
            return new ds(i2, obj);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory
    public final f a(int i2, j jVar, int i3, int i4, String str, boolean z, h hVar, x<ai> xVar) {
        Object obj = hVar.f132493a.get("is_story");
        Boolean bool = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null && bool2.booleanValue()) {
            return new j(jVar, i2, i3, i4, str, z, xVar);
        }
        Object obj2 = hVar.f132493a.get("is_shoutouts");
        if (obj2 instanceof Boolean) {
            bool = obj2;
        }
        Boolean bool3 = bool;
        if (bool3 == null || !bool3.booleanValue()) {
            return new com.ss.android.ugc.aweme.shortvideo.v.a.a(jVar, i2, i3, i4, str, z, xVar);
        }
        return new com.ss.android.ugc.aweme.shortvideo.v.j(jVar, i2, i3, i4, str, z, xVar);
    }
}
