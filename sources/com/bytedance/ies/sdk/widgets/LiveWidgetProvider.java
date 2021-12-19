package com.bytedance.ies.sdk.widgets;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.g;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class LiveWidgetProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion(null);
    public static volatile LiveWidgetProvider sInstance;
    private final RecycledLiveWidgetPool mRecycledViewPool;

    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion(null);
        public static final int DEFAULT_MAX_SCRAP = 3;
        private final HashMap<Class<? super IRecyclableWidget>, ScrapData> mScrap = new HashMap<>();

        public static final class Companion {
            static {
                Covode.recordClassIndex(20717);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        public static final class ScrapData {
            private final int mMaxScrap = RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP;
            private final ArrayList<IRecyclableWidget> mScrapHeap = new ArrayList<>(RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP);

            static {
                Covode.recordClassIndex(20718);
            }

            public final int getMMaxScrap() {
                return this.mMaxScrap;
            }

            public final ArrayList<IRecyclableWidget> getMScrapHeap() {
                return this.mScrapHeap;
            }
        }

        static {
            Covode.recordClassIndex(20716);
        }

        public final void clear() {
            Collection<ScrapData> values = this.mScrap.values();
            l.a((Object) values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().getMScrapHeap().clear();
            }
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getMScrapHeap().clear();
            }
        }

        public final int getRecycledViewCount(Class<? super IRecyclableWidget> cls) {
            l.c(cls, "");
            return getScrapDataForType(cls).getMScrapHeap().size();
        }

        public final ScrapData getScrapDataForType(Class<? super IRecyclableWidget> cls) {
            l.c(cls, "");
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(cls, scrapData2);
            return scrapData2;
        }

        public final IRecyclableWidget getRecycledView(Class<? super IRecyclableWidget> cls) {
            l.c(cls, "");
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData == null || !(!scrapData.getMScrapHeap().isEmpty())) {
                return null;
            }
            ArrayList<IRecyclableWidget> mScrapHeap = scrapData.getMScrapHeap();
            return mScrapHeap.remove(mScrapHeap.size() - 1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.ies.sdk.widgets.LiveWidgetProvider$RecycledLiveWidgetPool */
        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget iRecyclableWidget) {
            l.c(iRecyclableWidget, "");
            Class<?> cls = iRecyclableWidget.getClass();
            ArrayList<IRecyclableWidget> mScrapHeap = getScrapDataForType(cls).getMScrapHeap();
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData == null) {
                l.a();
            }
            if (scrapData.getMMaxScrap() > mScrapHeap.size()) {
                iRecyclableWidget.resetInternal();
                mScrapHeap.add(iRecyclableWidget);
            }
        }
    }

    static {
        Covode.recordClassIndex(20714);
    }

    public static final LiveWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(20715);
        }

        public static /* synthetic */ void instance$annotations() {
        }

        private Companion() {
        }

        public final LiveWidgetProvider getInstance() {
            MethodCollector.i(3872);
            if (LiveWidgetProvider.sInstance == null) {
                synchronized (LiveWidgetProvider.class) {
                    try {
                        if (LiveWidgetProvider.sInstance == null) {
                            LiveWidgetProvider.sInstance = new LiveWidgetProvider(null);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(3872);
                        throw th;
                    }
                }
            }
            LiveWidgetProvider liveWidgetProvider = LiveWidgetProvider.sInstance;
            if (liveWidgetProvider == null) {
                l.a();
            }
            MethodCollector.o(3872);
            return liveWidgetProvider;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final void clear() {
        this.mRecycledViewPool.clear();
    }

    private LiveWidgetProvider() {
        this.mRecycledViewPool = new RecycledLiveWidgetPool();
    }

    public /* synthetic */ LiveWidgetProvider(g gVar) {
        this();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.ies.sdk.widgets.LiveWidgetProvider$RecycledLiveWidgetPool */
    /* JADX WARN: Multi-variable type inference failed */
    public final void clearWidgetCache(Class<? extends LiveRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (!(cls instanceof Class)) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        l.c(iRecyclableWidget, "");
        this.mRecycledViewPool.putRecycledView(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final <T extends IRecyclableWidget> T provide(Class<T> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (cls != null) {
            T t = (T) recycledLiveWidgetPool.getRecycledView(cls);
            if (t != null) {
                return t;
            }
            try {
                T newInstance = cls.newInstance();
                if (newInstance == null) {
                    l.a();
                }
                T t2 = newInstance;
                if (!(t2 instanceof IRecyclableWidget)) {
                    return null;
                }
                return t2;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            throw new w("null cannot be cast to non-null type");
        }
    }
}
