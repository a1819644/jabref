package org.jabref.logic.search.matchers;

import java.util.Objects;

import org.jabref.logic.search.SearchMatcher;
import org.jabref.model.entry.BibEntry;

/**
 * Inverts the search result.
 * <p>
 * Example:
 * false --> true
 * true --> false
 */
public class NotMatcher implements SearchMatcher {

    private final SearchMatcher otherMatcher;

    public NotMatcher(SearchMatcher otherMatcher) {
        this.otherMatcher = Objects.requireNonNull(otherMatcher);
    }

    @Override
    public boolean isMatch(BibEntry entry) {
        return !otherMatcher.isMatch(entry);
    }
}
