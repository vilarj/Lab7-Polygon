package lab7Polygon;

import java.util.Iterator;

public interface ListIterator<T> extends Iterator<T> {
	/**
	 * Detects whether this iterator has gone beyond the last entry in the list.
	 * 
	 * @return True if the iterator has another entry to return when traversing the
	 *         list forward; otherwise returns false.
	 */
	public boolean hasNext();

	/**
	 * Retrieves the next entry in the list and advances this iterator by one
	 * position.
	 * 
	 * @return A reference to the next entry in the iteration, if one exists.
	 * @throws NoSuchElementException if the iterator had reached the end already,
	 *                                that is, if hasNext() is false.
	 */
	public T next();

	/**
	 * Removes from the list the last entry that either next() or previous() has
	 * returned. Precondition: next() or previous() has been called, but the
	 * iterator's remove() or add() method has not been called since then. That is,
	 * you can call remove only once per call to next() or previous(). The list has
	 * not been altered during the iteration except by calls to the iterator's
	 * remove(), add(), or set() methods.
	 * 
	 * @throws IllegalStateException         if next() or previous() has not been
	 *                                       called, or if remove() or add() has
	 *                                       been called already after the last call
	 *                                       to next() or previous().
	 * @throws UnsupportedOperationException if the iterator does not permit a
	 *                                       remove operation.
	 */
	public void remove(); // Optional method

	/**
	 * Detects whether this iterator has gone before the first entry in the list.
	 * 
	 * @return True if the iterator has another entry to visit when traversing the
	 *         list backward; otherwise returns false.
	 */
	public boolean hasPrevious();

	/**
	 * Retrieves the previous entry in the list and moves this iterator back by one
	 * position.
	 * 
	 * @return A reference to the previous entry in the iteration, if one exists.
	 * @throws NoSuchElementException if the iterator has no previous entry, that
	 *                                is, if hasPrevious() is false.
	 */
	public T previous();

	/**
	 * Gets the index of the next entry.
	 * 
	 * @return The index of the list entry that a subsequent call to next() would
	 *         return. If next() would not return an entry because the iterator is
	 *         at the end of the list, returns the size of the list. Note that the
	 *         iterator numbers the list entries from 0 instead of 1.
	 */
	public int nextIndex();

	/**
	 * Gets the index of the previous entry.
	 * 
	 * @return The index of the list entry that a subsequent call to previous()
	 *         would return. If previous() would not return an entry because the
	 *         iterator is at the beginning of the list, returns -1. Note that the
	 *         iterator numbers the list entries from 0 instead of 1.
	 */
	public int previousIndex();

	/**
	 * Adds an entry to the list just before the entry, if any, that next() would
	 * have returned before the addition. This addition is just after the entry, if
	 * any, that previous() would have returned. After the addition, a call to
	 * previous() will return the new entry, but a call to next() will behave as it
	 * would have before the addition. Further, the addition increases by 1 the
	 * values that nextIndex() and previousIndex() will return.
	 * 
	 * @param newEntry An object to be added to the list.
	 * @throws ClassCastException            if the class of newEntry prevents the
	 *                                       addition to the list.
	 * @throws IllegalArgumentException      if some other aspect of newEntry
	 *                                       prevents the addition to the list.
	 * @throws UnsupportedOperationException if the iterator does not permit an add
	 *                                       operation.
	 */
	public void add(T newEntry); // Optional method

	/**
	 * Replaces the last entry in the list that either next() or previous() has
	 * returned. Precondition: next() or previous() has been called, but the
	 * iterator's remove() or add() method has not been called since then.
	 * 
	 * @param newEntry An object that is the replacement entry.
	 * @throws ClassCastException            if the class of newEntry prevents the
	 *                                       addition to the list.
	 * @throws IllegalArgumentException      if some other aspect of newEntry
	 *                                       prevents the addition to the list.
	 * @throws IllegalStateException         if next() or previous() has not been
	 *                                       called, or if remove() or add() has
	 *                                       been called already after the last call
	 *                                       to next() or previous().
	 * @throws UnsupportedOperationException if the iterator does not permit a set
	 *                                       operation.
	 */
	public void set(T newEntry); // Optional method
} // end ListIterator
