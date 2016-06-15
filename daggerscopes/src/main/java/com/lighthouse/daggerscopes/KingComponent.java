package com.lighthouse.daggerscopes;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = KingModule.class)
public interface KingComponent {

    void inject(MainActivity target);

}
