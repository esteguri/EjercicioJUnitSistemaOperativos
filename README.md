# EjercicioJUnitSistemaOperativos

```javascript
const values = {};

return files.map(file => {

    const count = ++values[file] || 0;

    values[file] = count;

    return count > 0 ? `${file}(${count})` : file;

})
```
