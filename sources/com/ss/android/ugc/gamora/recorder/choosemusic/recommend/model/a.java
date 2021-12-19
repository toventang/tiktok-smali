package com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.fw;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.f.b.l;
import h.i.c;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147663e = new a(null, null);

    /* renamed from: f  reason: collision with root package name */
    public static final C3970a f147664f = new C3970a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public p<? extends MusicModel, Long> f147665a;

    /* renamed from: b  reason: collision with root package name */
    public p<? extends MusicModel, Long> f147666b;

    /* renamed from: c  reason: collision with root package name */
    public final RecommendMusic f147667c;

    /* renamed from: d  reason: collision with root package name */
    public final List<SimpleMusic> f147668d;

    /* renamed from: g  reason: collision with root package name */
    private p<? extends MusicModel, Long> f147669g;

    /* renamed from: h  reason: collision with root package name */
    private p<? extends MusicModel, Long> f147670h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f147667c, aVar.f147667c) && l.a(this.f147668d, aVar.f147668d);
    }

    public final int hashCode() {
        RecommendMusic recommendMusic = this.f147667c;
        int i2 = 0;
        int hashCode = (recommendMusic != null ? recommendMusic.hashCode() : 0) * 31;
        List<SimpleMusic> list = this.f147668d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RecommendMusicData(recommendMusic=" + this.f147667c + ", softBindMusic=" + this.f147668d + ")";
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a$a  reason: collision with other inner class name */
    public static final class C3970a {
        static {
            Covode.recordClassIndex(97336);
        }

        private C3970a() {
        }

        public /* synthetic */ C3970a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(97335);
    }

    public final void a() {
        this.f147669g = null;
        this.f147670h = null;
        this.f147665a = null;
        this.f147666b = null;
        List<SimpleMusic> list = this.f147668d;
        if (list != null && !list.isEmpty()) {
            a(this.f147668d);
        }
        RecommendMusic recommendMusic = this.f147667c;
        if (recommendMusic != null) {
            a(recommendMusic);
        }
        if (this.f147669g == null) {
            this.f147669g = this.f147665a;
        }
        if (this.f147670h == null) {
            this.f147670h = this.f147666b;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long>, h.p<com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> */
    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long>, h.p<com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> */
    public final p<MusicModel, Long> a(boolean z) {
        if (z) {
            return this.f147670h;
        }
        return this.f147669g;
    }

    private final void a(List<SimpleMusic> list) {
        MusicModel musicModel;
        int duration;
        Music musicModel2 = ((SimpleMusic) n.g((List) list)).getMusicModel();
        if (musicModel2 != null) {
            musicModel = musicModel2.convertToMusicModel();
        } else {
            musicModel = null;
        }
        this.f147669g = v.a(musicModel, 0L);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Music musicModel3 = it.next().getMusicModel();
            if (musicModel3 != null) {
                if (musicModel3.getShootDuration() > 0) {
                    duration = musicModel3.getShootDuration();
                } else {
                    duration = musicModel3.getDuration();
                }
                if (duration > 180) {
                    this.f147670h = v.a(musicModel3.convertToMusicModel(), 0L);
                }
            }
        }
    }

    private final void a(RecommendMusic recommendMusic) {
        Object next;
        int duration;
        List<MusicInfoAndEffectUseCount> musicList = recommendMusic.getMusicList();
        if (!(musicList == null || musicList.isEmpty())) {
            List<MusicInfoAndEffectUseCount> musicList2 = recommendMusic.getMusicList();
            if (musicList2 == null) {
                l.b();
            }
            ArrayList arrayList = new ArrayList();
            for (T t : musicList2) {
                if (t.getUseCount() >= ((long) fw.d())) {
                    arrayList.add(t);
                }
            }
            List list = (List) n.b((Iterable) arrayList, (Collection) new ArrayList());
            Object obj = null;
            if (fw.e()) {
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount = (MusicInfoAndEffectUseCount) list.get(c.Default.nextInt(list.size()));
                this.f147665a = v.a(musicInfoAndEffectUseCount.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount.getUseCount()));
            } else {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        long useCount = ((MusicInfoAndEffectUseCount) next).getUseCount();
                        do {
                            Object next2 = it.next();
                            long useCount2 = ((MusicInfoAndEffectUseCount) next2).getUseCount();
                            if (useCount < useCount2) {
                                next = next2;
                                useCount = useCount2;
                            }
                        } while (it.hasNext());
                    }
                }
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount2 = (MusicInfoAndEffectUseCount) next;
                if (musicInfoAndEffectUseCount2 != null) {
                    this.f147665a = v.a(musicInfoAndEffectUseCount2.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount2.getUseCount()));
                }
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                MusicInfoAndEffectUseCount musicInfoAndEffectUseCount3 = (MusicInfoAndEffectUseCount) next3;
                if (musicInfoAndEffectUseCount3.getMusicInfo().getShootDuration() > 0) {
                    duration = musicInfoAndEffectUseCount3.getMusicInfo().getShootDuration();
                } else {
                    duration = musicInfoAndEffectUseCount3.getMusicInfo().getDuration();
                }
                if (duration >= 180) {
                    obj = next3;
                    break;
                }
            }
            MusicInfoAndEffectUseCount musicInfoAndEffectUseCount4 = (MusicInfoAndEffectUseCount) obj;
            if (musicInfoAndEffectUseCount4 != null) {
                this.f147666b = v.a(musicInfoAndEffectUseCount4.getMusicInfo().convertToMusicModel(), Long.valueOf(musicInfoAndEffectUseCount4.getUseCount()));
            }
        }
    }

    public a(RecommendMusic recommendMusic, List<SimpleMusic> list) {
        this.f147667c = recommendMusic;
        this.f147668d = list;
        a();
    }
}
