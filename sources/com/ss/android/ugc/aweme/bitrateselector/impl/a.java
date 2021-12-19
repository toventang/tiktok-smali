package com.ss.android.ugc.aweme.bitrateselector.impl;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

final class a {

    static class c {
        static {
            Covode.recordClassIndex(42292);
        }
    }

    static class d {
        static {
            Covode.recordClassIndex(42294);
        }
    }

    static class f {
        static {
            Covode.recordClassIndex(42299);
        }
    }

    static {
        Covode.recordClassIndex(42288);
    }

    /* renamed from: com.ss.android.ugc.aweme.bitrateselector.impl.a$a  reason: collision with other inner class name */
    static class C1552a {
        static {
            Covode.recordClassIndex(42289);
        }

        static com.ss.android.ugc.f.a.a.a.a.a a(final com.ss.android.ugc.aweme.bitrateselector.a.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new com.ss.android.ugc.f.a.a.a.a.a() {
                /* class com.ss.android.ugc.aweme.bitrateselector.impl.a.C1552a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(42290);
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.a
                public final double a() {
                    return aVar.a();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.a
                public final double b() {
                    return aVar.b();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.a
                public final double c() {
                    return aVar.c();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.a
                public final double d() {
                    return aVar.d();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.a
                public final double e() {
                    return aVar.e();
                }
            };
        }
    }

    static class e {
        static {
            Covode.recordClassIndex(42297);
        }

        static com.ss.android.ugc.f.a.a.a.a.d a(final com.ss.android.ugc.aweme.bitrateselector.a.a.d dVar) {
            if (dVar == null) {
                return null;
            }
            return new com.ss.android.ugc.f.a.a.a.a.d() {
                /* class com.ss.android.ugc.aweme.bitrateselector.impl.a.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(42298);
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.d
                public final String a() {
                    return dVar.a();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.d
                public final Set<String> b() {
                    return dVar.b();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.d
                public final double c() {
                    return dVar.c();
                }

                @Override // com.ss.android.ugc.f.a.a.a.a.d
                public final Pair<Double, Double> d() {
                    return dVar.d();
                }
            };
        }
    }

    static class b {
        static {
            Covode.recordClassIndex(42291);
        }

        static List<? extends com.ss.android.ugc.f.a.a.a.a.b> a(List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.bitrateselector.a.a.b bVar : list) {
                arrayList.add(bVar == null ? null : new com.ss.android.ugc.f.a.a.a.a.b(bVar) {
                    /* class com.ss.android.ugc.aweme.bitrateselector.impl.a.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.aweme.bitrateselector.a.a.b f68712a;

                    static {
                        Covode.recordClassIndex(42293);
                    }

                    @Override // com.ss.android.ugc.f.a.a.a.a.b
                    public final double getBitrate() {
                        return this.f68712a.b();
                    }

                    @Override // com.ss.android.ugc.f.a.a.a.a.b
                    public final double getSpeed() {
                        return this.f68712a.a();
                    }

                    {
                        this.f68712a = r1;
                    }
                });
            }
            return arrayList;
        }
    }

    static class g {
        static {
            Covode.recordClassIndex(42301);
        }

        static List<? extends com.ss.android.ugc.f.a.a.a.a.e> a(List<? extends com.ss.android.ugc.aweme.bitrateselector.a.a.e> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.bitrateselector.a.a.e eVar : list) {
                arrayList.add(eVar == null ? null : new com.ss.android.ugc.f.a.a.a.a.e(eVar) {
                    /* class com.ss.android.ugc.aweme.bitrateselector.impl.a.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.aweme.bitrateselector.a.a.e f68716a;

                    static {
                        Covode.recordClassIndex(42300);
                    }

                    @Override // com.ss.android.ugc.f.a.a.a.a.e
                    public final int getBitRate() {
                        return this.f68716a.c();
                    }

                    @Override // com.ss.android.ugc.f.a.a.a.a.e
                    public final int getNetworkLower() {
                        return this.f68716a.b();
                    }

                    @Override // com.ss.android.ugc.f.a.a.a.a.e
                    public final int getNetworkUpper() {
                        return this.f68716a.a();
                    }

                    {
                        this.f68716a = r1;
                    }
                });
            }
            return arrayList;
        }
    }
}
