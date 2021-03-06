package com.carlosbecker.github;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.PullRequestService;

import com.carlosbecker.ConfigModule;
import com.carlosbecker.model.ScriptedRepositories;
import com.carlosbecker.model.ScriptedRepositoriesProvider;
import com.google.inject.AbstractModule;

public class GithubModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new ConfigModule());

        bind(GitHubClient.class).toProvider(GitHubClientProvider.class);
        bind(PullRequestService.class).toProvider(PullRequestServiceProvider.class);
        bind(IssueService.class).toProvider(IssueServiceProvider.class);

        bind(ScriptedRepositories.class).toProvider(ScriptedRepositoriesProvider.class);
    }
}
