# Database Engine with B+ Tree Index Support

## Description

This project is a small database engine implementation with support for B+ tree index. It provides functionalities such as creating tables, inserting and updating tuples, deleting tuples, searching in tables linearly, creating a B+ tree index upon demand, and utilizing the created indices where appropriate.

### Features
1. **Table Management**:
   - Create tables with specified columns and data types.
   - Store each table as pages on disk, with a predetermined maximum number of rows per page.
   - Track page files for each table to manage storage efficiently.

2. **Tuple Operations**:
   - Insert and update tuples into tables.
   - Delete tuples, automatically removing empty pages.

3. **Indexing**:
   - Support B+ tree indices.
   - Update existing indices upon tuple insertion/deletion.
   - Create indices upon user request.

4. **Metadata Handling**:
   - Store metadata associated with user tables in a `metadata.csv` file.
   - Validate data types and retrieve metadata information for operations.

5. **Optimization**:
   - Utilize binary search where applicable to optimize in-memory operations.
   - Load pages and indices only when necessary to conserve memory.

### Implementation Details
- Utilize Java's binary object file (.class) for emulating pages to manage table storage.
- Serialize tuples as vectors of objects for efficient storage and retrieval.
- Store metadata in a structured CSV file for easy access and validation.
- Support for transient attributes to control serialization behavior.

### Indexing Strategy
- Implement B+ tree indices for efficient data retrieval.
- Utilize existing open-source B+ tree implementations for index management.
- Update indices dynamically upon tuple operations to maintain data integrity.

### Usage
For detailed usage instructions and API documentation, please refer to the project documentation.


