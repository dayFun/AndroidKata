package com.lighthouse.daggerscopes;

import dagger.Module;
import dagger.Provides;

@Module
public class KingModule {

    @Provides
    public String provideKingString() {
        return "I am the Emperor of Oranges!";
    }
}
