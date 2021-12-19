package emotes;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import emotes.model.EmoteListResult;
import emotes.model.SubEmoteDetailResult;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static f.a.b.a f157062a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f157063b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f157064c = new a();

    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f157091a = new c();

        static {
            Covode.recordClassIndex(104305);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(104302);
    }

    /* renamed from: emotes.a$a  reason: collision with other inner class name */
    public static final class C4149a implements g<d<SubEmoteDetailResult>, d<SubEmoteDetailResult>> {
        static {
            Covode.recordClassIndex(104303);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ d<SubEmoteDetailResult> apply(d<SubEmoteDetailResult> dVar) {
            d<SubEmoteDetailResult> dVar2 = dVar;
            l.d(dVar2, "");
            if (dVar2.data != null) {
                Object obj = dVar2.data;
                l.b(obj, "");
                if (((SubEmoteDetailResult) obj).getStableEmoteDetail() != null) {
                    Object obj2 = dVar2.data;
                    l.b(obj2, "");
                    EmoteListResult stableEmoteDetail = ((SubEmoteDetailResult) obj2).getStableEmoteDetail();
                    l.b(stableEmoteDetail, "");
                    if (stableEmoteDetail.getEmoteList() != null) {
                        if (dVar2.data != null) {
                            Object obj3 = dVar2.data;
                            l.b(obj3, "");
                            if (((SubEmoteDetailResult) obj3).getStableEmoteDetail() != null) {
                                Object obj4 = dVar2.data;
                                l.b(obj4, "");
                                EmoteListResult stableEmoteDetail2 = ((SubEmoteDetailResult) obj4).getStableEmoteDetail();
                                l.b(stableEmoteDetail2, "");
                                if (stableEmoteDetail2.getEmoteList() != null) {
                                    Object obj5 = dVar2.data;
                                    l.b(obj5, "");
                                    EmoteListResult stableEmoteDetail3 = ((SubEmoteDetailResult) obj5).getStableEmoteDetail();
                                    l.b(stableEmoteDetail3, "");
                                    for (EmoteModel emoteModel : stableEmoteDetail3.getEmoteList()) {
                                        l.b(emoteModel, "");
                                        if (emoteModel.f7391h != null) {
                                            emoteModel.f7396m = com.bytedance.android.livesdk.chatroom.g.g.c(emoteModel.f7391h);
                                        }
                                    }
                                }
                            }
                        }
                        if (dVar2.data != null) {
                            Object obj6 = dVar2.data;
                            l.b(obj6, "");
                            if (((SubEmoteDetailResult) obj6).getEmoteConfig() != null) {
                                Object obj7 = dVar2.data;
                                l.b(obj7, "");
                                if (((SubEmoteDetailResult) obj7).getEmoteConfig().f7404b != null) {
                                    Object obj8 = dVar2.data;
                                    l.b(obj8, "");
                                    for (EmoteModel emoteModel2 : ((SubEmoteDetailResult) obj8).getEmoteConfig().f7404b) {
                                        l.b(emoteModel2, "");
                                        if (emoteModel2.f7391h != null) {
                                            emoteModel2.f7396m = com.bytedance.android.livesdk.chatroom.g.g.c(emoteModel2.f7391h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return dVar2;
        }
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f157081a = new b();

        static {
            Covode.recordClassIndex(104304);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            d dVar = (d) obj;
            if (a.f157063b) {
                ArrayList arrayList = new ArrayList();
                if (dVar != null) {
                    if (dVar.data != null) {
                        Object obj2 = dVar.data;
                        l.b(obj2, "");
                        if (((SubEmoteDetailResult) obj2).getStableEmoteDetail() != null) {
                            Object obj3 = dVar.data;
                            l.b(obj3, "");
                            EmoteListResult stableEmoteDetail = ((SubEmoteDetailResult) obj3).getStableEmoteDetail();
                            l.b(stableEmoteDetail, "");
                            if (stableEmoteDetail.getEmoteList() != null) {
                                Object obj4 = dVar.data;
                                l.b(obj4, "");
                                EmoteListResult stableEmoteDetail2 = ((SubEmoteDetailResult) obj4).getStableEmoteDetail();
                                l.b(stableEmoteDetail2, "");
                                List<EmoteModel> emoteList = stableEmoteDetail2.getEmoteList();
                                l.b(emoteList, "");
                                arrayList.addAll(emoteList);
                            }
                        }
                    }
                    if (dVar.data != null) {
                        Object obj5 = dVar.data;
                        l.b(obj5, "");
                        if (((SubEmoteDetailResult) obj5).getEmoteConfig() != null) {
                            Object obj6 = dVar.data;
                            l.b(obj6, "");
                            if (((SubEmoteDetailResult) obj6).getEmoteConfig().f7404b != null) {
                                Object obj7 = dVar.data;
                                l.b(obj7, "");
                                List<EmoteModel> list = ((SubEmoteDetailResult) obj7).getEmoteConfig().f7404b;
                                l.b(list, "");
                                arrayList.addAll(list);
                            }
                        }
                    }
                }
                DataChannelGlobal.f34575d.b(com.bytedance.android.live.d.class, arrayList);
            }
        }
    }
}
