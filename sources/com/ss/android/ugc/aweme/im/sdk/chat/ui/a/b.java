package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.im.sdk.chat.b.g;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareLiveContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareUserContent;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.UserStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.r;
import h.z;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final am f101105a = an.a(bf.f159041b);

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f101106b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a f101107c;

    /* renamed from: d  reason: collision with root package name */
    public final ai f101108d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a f101109e;

    static {
        Covode.recordClassIndex(64684);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, d dVar) {
            super(2, dVar);
            this.this$0 = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            boolean z;
            if (this.label == 0) {
                r.a(obj);
                final BaseContent b2 = b.f.b(this.this$0.f101108d);
                if (b2 == null) {
                    return z.f158842a;
                }
                if (b2 instanceof ShareUserContent) {
                    ShareUserContent shareUserContent = (ShareUserContent) b2;
                    pVar = new p(shareUserContent.getSecUid(), shareUserContent.getUid());
                } else if (b2 instanceof ShareAwemeContent) {
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b2;
                    pVar = new p(shareAwemeContent.getSecUid(), shareAwemeContent.getUser());
                } else if (b2 instanceof ShareLiveContent) {
                    ShareLiveContent shareLiveContent = (ShareLiveContent) b2;
                    pVar = new p(shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomOwnerId());
                } else {
                    pVar = new p("", "");
                }
                final String str = (String) pVar.component1();
                final String str2 = (String) pVar.component2();
                l.b(str2, "");
                if (str2.length() == 0) {
                    return z.f158842a;
                }
                long c2 = b.a.c(this.this$0.f101109e.getConversationId());
                com.bytedance.ies.ugc.appcontext.d.a();
                com.ss.android.ugc.aweme.common.r.a("follow", "chat", str2, c2);
                String conversationId = this.this$0.f101109e.getConversationId();
                if (this.this$0.f101109e.getChatType() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                long c3 = b.a.c(conversationId);
                androidx.c.a aVar = new androidx.c.a();
                aVar.put("to_user_id", String.valueOf(c3));
                aVar.put("previous_page", "message");
                aVar.put("previous_page_position", "other_places");
                if (z) {
                    aVar.put("enter_from", "group_chat");
                } else {
                    aVar.put("enter_from", "chat");
                }
                aVar.put("enter_method", "card");
                com.ss.android.ugc.aweme.common.r.a("follow", aVar);
                FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(str2, str, 1, new IFollowService.a(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f101110a;

                    static {
                        Covode.recordClassIndex(64686);
                    }

                    @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
                    public final void a() {
                        BaseContent baseContent = b2;
                        if (baseContent instanceof ShareAwemeContent) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
                            IMUser iMUser = new IMUser();
                            iMUser.setNickName(shareAwemeContent.getContentName());
                            iMUser.setAvatarThumb(shareAwemeContent.getContentThumb());
                            iMUser.setSignature("");
                            iMUser.setUid(shareAwemeContent.getUser());
                            l.b(iMUser, "");
                            iMUser.setFollowStatus(1);
                            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(iMUser);
                        } else if (baseContent instanceof ShareUserContent) {
                            ShareUserContent shareUserContent = (ShareUserContent) baseContent;
                            IMUser iMUser2 = new IMUser();
                            iMUser2.setNickName(shareUserContent.getName());
                            iMUser2.setAvatarThumb(shareUserContent.getAvatar());
                            iMUser2.setSignature("");
                            iMUser2.setUid(shareUserContent.getUid());
                            l.b(iMUser2, "");
                            iMUser2.setFollowStatus(1);
                            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(iMUser2);
                        } else if (baseContent instanceof ShareLiveContent) {
                            ShareLiveContent shareLiveContent = (ShareLiveContent) baseContent;
                            IMUser iMUser3 = new IMUser();
                            iMUser3.setNickName(shareLiveContent.getRoomOwnerName());
                            iMUser3.setAvatarThumb(shareLiveContent.getRoomOwnerAvatar());
                            iMUser3.setSignature("");
                            iMUser3.setUid(shareLiveContent.getRoomOwnerId());
                            l.b(iMUser3, "");
                            iMUser3.setFollowStatus(1);
                            com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(iMUser3);
                        }
                        bz unused = i.a(this.f101110a.this$0.f101105a, o.f159148a, null, new C2515b(this, null), 2);
                        bz unused2 = i.a(this.f101110a.this$0.f101105a, null, null, new c(this, null), 3);
                        if (this.f101110a.this$0.f101106b != null) {
                            bz unused3 = i.a(this.f101110a.this$0.f101105a, o.f159148a, null, new d(this, null), 2);
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$b  reason: collision with other inner class name */
                    static final class C2515b extends k implements m<am, h.c.d<? super z>, Object> {
                        int label;
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(64688);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C2515b(AnonymousClass1 r2, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return new C2515b(this.this$0, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                            return ((C2515b) create(amVar, dVar)).invokeSuspend(z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            if (this.label == 0) {
                                r.a(obj);
                                this.this$0.f101110a.this$0.f101107c.a();
                                return z.f158842a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
                    public final void a(Exception exc) {
                        l.d(exc, "");
                        if (this.f101110a.this$0.f101106b != null) {
                            bz unused = i.a(this.f101110a.this$0.f101105a, o.f159148a, null, new C2514a(this, null), 2);
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$a  reason: collision with other inner class name */
                    static final class C2514a extends k implements m<am, h.c.d<? super z>, Object> {
                        int label;
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(64687);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C2514a(AnonymousClass1 r2, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return new C2514a(this.this$0, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                            return ((C2514a) create(amVar, dVar)).invokeSuspend(z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            if (this.label == 0) {
                                r.a(obj);
                                new com.bytedance.tux.g.b(this.this$0.f101110a.this$0.f101106b).e(R.string.ciy).b();
                                return z.f158842a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$d */
                    static final class d extends k implements m<am, h.c.d<? super z>, Object> {
                        int label;
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(64690);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        d(AnonymousClass1 r2, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return new d(this.this$0, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            if (this.label == 0) {
                                r.a(obj);
                                new com.bytedance.tux.g.b(this.this$0.f101110a.this$0.f101106b).e(R.string.cev).b();
                                return z.f158842a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$c */
                    static final class c extends k implements m<am, h.c.d<? super z>, Object> {
                        int label;
                        final /* synthetic */ AnonymousClass1 this$0;

                        static {
                            Covode.recordClassIndex(64689);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        c(AnonymousClass1 r2, h.c.d dVar) {
                            super(2, dVar);
                            this.this$0 = r2;
                        }

                        @Override // h.c.b.a.a
                        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                            l.d(dVar, "");
                            return new c(this.this$0, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // h.f.a.m
                        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
                        }

                        @Override // h.c.b.a.a
                        public final Object invokeSuspend(Object obj) {
                            if (this.label == 0) {
                                r.a(obj);
                                UserStruct userStruct = null;
                                try {
                                    userStruct = com.ss.android.ugc.aweme.im.sdk.common.data.api.a.f102469a.queryUser(str2, str).get();
                                } catch (InterruptedException e2) {
                                    e2.printStackTrace();
                                } catch (ExecutionException e3) {
                                    e3.printStackTrace();
                                }
                                if (!(userStruct == null || userStruct.getUser() == null)) {
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(IMUser.fromUser(userStruct.getUser()));
                                }
                                return z.f158842a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    {
                        this.f101110a = r1;
                    }
                });
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(RecyclerView recyclerView, g.a aVar, ai aiVar, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar2) {
        l.d(aVar, "");
        l.d(aiVar, "");
        l.d(aVar2, "");
        this.f101106b = recyclerView;
        this.f101107c = aVar;
        this.f101108d = aiVar;
        this.f101109e = aVar2;
    }
}
